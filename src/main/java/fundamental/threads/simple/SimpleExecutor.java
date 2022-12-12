package fundamental.threads.simple;

import java.util.concurrent.*;

public class SimpleExecutor {

    public static void main(String[] args) {

        try {
            createSimpeExecutorService();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static void createSimpeExecutorService() throws ExecutionException, InterruptedException {


        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newFixedThreadPool(2);

        Runnable runnable = null;
        executorService1.execute(runnable);

        Callable<String> task=null;
        Future<String> future = executorService2.submit(task);
        String result = future.get(); // appel bloquant


    }

}
