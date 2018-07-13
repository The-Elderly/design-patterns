package com.chaoyue.design.patterns.chapter2.version1;

/**
 * 布告板 作为观察者 通过update方法接受主题的变更推送
 * 观察者中也需要包含主题，即需要确定订阅的是哪个主题 并进行订阅和取消订阅操作
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    //初始化的时候传入主题 并注册为该主题的观察者
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public Subject getWeatherData() {
        return weatherData;
    }

    @Override
    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
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
