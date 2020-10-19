package createPattern.singleton;

/**
 * 懒汉式单利
 */
public class SingletonLazyFactory {
    /**
     * volatile 的作用在于保证 JVM 对新对象的创建过程的顺序是一致的
     * 1、分配空间
     * 2、构造函数初始化
     * 3、索引指向分配空间
     */
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
