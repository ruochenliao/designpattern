package actionPattern.observePattern;

/**
 * 应用
 * 监听模式，可以出发观察链
 *
 * 观察者模式定义了对象之间一对多的依赖关系，这样一来，当一个对象改变时，它的所有依赖者都会收到通知并且自动更新
 *
 * 优点
 * 让观察者与主题之间解耦
 * 观察者支持"广播通信"
 * 观察者符合"开闭原则"的要求
 *
 * 缺点
 *
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ConcreteObserver concreteObserver = new ConcreteObserver(weatherData);
        weatherData.setWeatherData(10,10,10);
    }
}
