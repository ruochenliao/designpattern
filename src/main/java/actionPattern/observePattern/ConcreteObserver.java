package actionPattern.observePattern;

/**
 * 观察者具体类
 *
 * 它的构造函数包含了注册观察者到主题
 */
public class ConcreteObserver implements Observer {

    private Subject weatherData;

    public ConcreteObserver(Subject subject) {
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }

    public void update(int temperature, int pressure, int huminity) {
        System.out.println("温度:" + temperature + " 压力:" + pressure + "湿度:" + huminity);
    }
}
