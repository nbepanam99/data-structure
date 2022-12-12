package fundamental.threads.simple;

public class SimpleThread {

    /**
     * Daemon : it's a specific property (boolean) because JVM stop if no daemon Thread still alive.
     * **/
    public static void main(String[] args) {
        System.out.println("-- Start running thread ");
        Runnable task = ()->{
            System.out.println("Hello Task 1 ");
        };

        task.run(); // this task does not create new thread.

        Thread thread = new Thread(task);
        thread.start(); // start method from task in different task

        System.out.println("Current Thread : " +Thread.currentThread().getName());
        System.out.println("Thread is alive ? " + thread.isAlive());
        System.out.println("Thread is alive ? " + thread.isAlive());
        System.out.println("Thread is daemon ? " +thread.isDaemon());
        System.out.println("Thread is interrupted ? " +thread.isInterrupted());

        runTaskWithParameter("param 1");

    }

    private static void runTaskWithParameter(String param) {
        class OneShotTask implements Runnable {
            String str;
            OneShotTask(String s) { str = s; }
            public void run() {
                System.out.println(str);
            }
        }
        Thread t = new Thread(new OneShotTask(param));
        t.start();


    }
}
