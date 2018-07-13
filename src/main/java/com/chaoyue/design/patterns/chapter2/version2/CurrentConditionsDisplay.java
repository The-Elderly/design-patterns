package com.chaoyue.design.patterns.chapter2.version2;

import java.util.Observable;
import java.util.Observer;

/**
 * 使用java 内置 Observer 实现观察者功能
 * Observer是一个接口
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    // 使用java自带的主题超类来代替version1中的接口
    private Observable observable;

    private float temperature;
    private float humidity;
    private float pressure;

    // 初始化时添加主题
    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        // 注册为当前主题的观察者
        observable.addObserver(this);
    }

    public Observable getObservable() {
        return observable;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void update(Observable o, Object arg) {
        // 因为使用的超类接收 进行向下转型时需要判断具体类型
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
        }
        display();
    }

    @Override
    public String toString() {
        return "CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
