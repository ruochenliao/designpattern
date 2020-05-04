package actionPattern.observePattern;

import java.util.List;

/**
 * 被观察的具体对象
 */
public class WeatherData implements Subject{

    int temperature;
    int pressure;
    int humidity;

    List<Observer> observerList;

    public WeatherData(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public WeatherData(){}

    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer:observerList){
            observer.update(temperature, pressure, humidity);
        }
    }

    /**
     * 兼顾了事件与事件源
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setWeatherData(int temperature, int pressure, int humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }
}
