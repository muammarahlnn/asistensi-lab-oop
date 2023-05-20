import java.util.Random;
import java.util.concurrent.*;

public class DataLoaderApp {
    private static int NUM_OF_DATA_SOURCES = 4;

    public static void main(String[] args) {
        System.out.println("Start load " + NUM_OF_DATA_SOURCES + " Data");

        ExecutorService executorService = Executors.newFixedThreadPool(3);     //mengatur dan menjalankan tugas secara paralel
        CompletionService<Boolean> completionService = new ExecutorCompletionService<>(executorService); //mendapatkan hasil dari tugas yang dieksekusi yaitu dari executorService
        TaskTimeHelper timeHelper = new TaskTimeHelper();

        for (int i = 0; i < NUM_OF_DATA_SOURCES; i++) {
            completionService.submit(new DataLoadTask(timeHelper));   
        }

        int successfulCount = 0;
        int failedCount = 0;
        long startTime = System.currentTimeMillis();        //waktu yang dibutuhkan 

        for (int i = 0; i < NUM_OF_DATA_SOURCES; i++) {
            try {
                Future<Boolean> result = completionService.take();
                boolean isSuccessful = result.get();

                if (isSuccessful) {
                    successfulCount++;

                } else {
                    failedCount++;
                }

                System.out.println("Loading... (" + (i + 1) + "s)");
                Thread.sleep(1000); // Memberikan jeda 1 detik antara setiap tampilan output

            } catch (InterruptedException | ExecutionException e) {
                // System.out.println("Exception occurred while loading data: " + e.getMessage());
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = (endTime - startTime) / 1000;

        System.out.println("\nTask Finish.");
        System.out.println("Time Execution : " + executionTime + "s");

        if (successfulCount == NUM_OF_DATA_SOURCES) {
            System.out.println("All data is successfully loaded");
        } else {
            System.out.println(successfulCount + " Data Successfully loaded & " + failedCount + " Data failed to load.");
        }
        executorService.shutdown();
    }
}

class DataLoadTask implements Callable<Boolean> {
    private TaskTimeHelper timeHelper;
    private int MAX_EXECUTION_TIME = 4;

    DataLoadTask(TaskTimeHelper timeHelper) {
        this.timeHelper = timeHelper;
    }

    @Override
    public Boolean call() throws Exception {
        int executionTime = timeHelper.getRandomExecutionTime();

        if (executionTime > MAX_EXECUTION_TIME) {
            System.out.println("Request Timeout");
            return false;
        }
        
        Thread.sleep(executionTime * 1000);
        return true;
    }
}

class TaskTimeHelper {
    private Random random;                       //objek random yang menghasilkan hasil eksekusi acak yang dilakukan oleh class DataLoadApp

    TaskTimeHelper() {
        random = new Random();
    }

    int getRandomExecutionTime() {
        return random.nextInt(6) + 1;      //mewakili waktu eksekusi tugas
    }
}