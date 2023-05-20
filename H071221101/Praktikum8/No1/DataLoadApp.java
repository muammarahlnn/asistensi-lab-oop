package No1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class DataLoadApp {
    private static final int DATA_SOURCES = 4;
    private static final int THREAD_POOLS = 3;

    private static int successLoadData = 0;
    private static int failedLoadData = 0;
    private static boolean isFinished = false;

    public static void main(String[] args) {
        System.out.println(String.format("Start load %d Data", DATA_SOURCES));
        // Background Thread
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOLS);
        for (int i = 0; i < DATA_SOURCES; i++) { 
            executor.execute(() -> {
                int executionTime = TaskTimeHelper.getRandomNumber();
                try {
                    // delay (it will give rest 1 second everytime in output)
                    Thread.sleep(executionTime * 1000);
                    if (executionTime > 4) {
                        System.out.println("Request Timeout");
                        incrementFailedLoadData();
                    } else {
                        incrementSuccessLoadData();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // if (executionTime > 4) {
                    
                //     return;
                // } else {
                    
                // }
                checkDataLoadingStatus();
            });
        }
        // when all the threads have done
        executor.shutdown();
        // UI Thread
        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                System.out.println("\nTask Finished.");
                // -1 as same as the second
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (successLoadData == DATA_SOURCES) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out.println(String.format("%d Data Successfully loaded & %d Data Failed to load", successLoadData, failedLoadData));
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }
    // synchronized for only one method in 1 time (only 1)
    public static synchronized void incrementSuccessLoadData() {
        successLoadData++;
    }
    public static synchronized void incrementFailedLoadData() {
        failedLoadData++;
    }
    public static synchronized void checkDataLoadingStatus() {
        if (successLoadData + failedLoadData == DATA_SOURCES) {
            isFinished = true;
        }
    }
}
//for the time the load
class TaskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
