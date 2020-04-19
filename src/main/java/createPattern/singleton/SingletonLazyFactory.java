package createPattern.singleton;

/**
 * 懒汉式单利
 */
public class SingletonLazyFactory {

    private static volatile Singleton singleton;

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
