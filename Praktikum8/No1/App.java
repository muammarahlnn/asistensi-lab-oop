import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    private int Num_Data = 0;
    private int Num_Thread = 0;
    private List<Integer> succesLoadData;
    private List<Integer> failedLoadData;

    public App(int Num_Data, int Num_Thread) {
        this.Num_Data = Num_Data;
        this.Num_Thread = Num_Thread;
        this.succesLoadData = new ArrayList<>();
        this.failedLoadData = new ArrayList<>();
    }
    public void start() {
        System.out.println(String.format("Start load %d Data" , Num_Data ));

        ExecutorService executor = Executors.newFixedThreadPool(Num_Thread);
        for (int i = 0; i < Num_Data; i++) {
            executor.execute(new LoadDataTask(i));
        }
        executor.shutdown();

        Thread uiThread = new Thread(new UIThread());
        uiThread.start();

        while (!executor.isTerminated()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            uiThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private class LoadDataTask implements Runnable {
        private int sourceId;

        public LoadDataTask(int sourceId) {
            this.sourceId = sourceId;
        }
        @Override
        public void run() {
            int taskTime = TaskTimeHelper.generateTaskTime();
            try {
                Thread.sleep(taskTime * 1000);
                succesLoadData.add(sourceId);
            } catch (InterruptedException e) {
                failedLoadData.add(sourceId);
            }
            if (taskTime > 4) {
                System.out.println("Request Timeout");
                failedLoadData.add(sourceId);
            }
        }
    }
    private static class TaskTimeHelper {
        public static int generateTaskTime() {
            Random random = new Random();
            return random.nextInt(6) + 1;
        }
    }
    private class UIThread implements Runnable {
        @Override
        public void run() {
            int totalTime = 0;
            while (succesLoadData.size() + failedLoadData.size() < Num_Data) {
                try {
                    Thread.sleep(1000);
                    totalTime++;
                    System.out.println("Loading... (" + totalTime + "s)");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int totalLoaded = succesLoadData.size();
            int totalFailed = failedLoadData.size();
            if (totalFailed > 0) {
                System.out.println("Task Finish.\nTime Execution: " + totalTime + "s\n"
                        + totalLoaded + " Data Successfully Loaded & " + totalFailed + " Data failed to load.");
            } else {
                System.out.println("Task Finish.\nTime Execution: " + totalTime + "s\nAll data is successfully loaded");
            }
        }
    }
    public static void main(String[] args) {
        App dataLoader = new App(4, 3);
        dataLoader.start();
       
        
    }
}