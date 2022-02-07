package fundamental.threads.simple;

/**
 * Race Condition: 2 thread can read and write, the same variable => this singleton, is ko.
 * We must to Synchronized a code bloc tp prevent the race condition.
 * Code bloc can be Synchronized (best solution) or Instance Method or Class Method.
 * **/
public class SingletonService {

    private static SingletonService singletonService;

    private SingletonService() {
    }

    public static SingletonService getInstance(){
        Object lock = new Object();
        synchronized (lock) {
            if (singletonService == null){
                return new SingletonService();
            }
            return singletonService;
        }
    }

}
