package fundamental.threads.simple;

public class SingletonService {

    private static SingletonService singletonService;

    private SingletonService() {
    }

    public static SingletonService getInstance(){
        if (singletonService == null){
            return new SingletonService();
        }
        return singletonService;
    }

}
