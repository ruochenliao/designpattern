package createPattern.singleton;

/**
 * 饿汉式单利模式
 */
public class SingletonHungryFactory {

    private static class SingletonHolder {
        private static final Singleton singleton = new Singleton();
    }

    public static final Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
