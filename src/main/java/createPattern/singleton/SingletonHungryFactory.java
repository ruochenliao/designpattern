package createPattern.singleton;

/**
 * 饿汉单例模式
 */
public class SingletonHungryFactory {

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static final Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
