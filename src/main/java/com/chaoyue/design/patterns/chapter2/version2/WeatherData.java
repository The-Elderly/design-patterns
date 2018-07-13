package com.chaoyue.design.patterns.chapter2.version2;

import java.util.Observable;

/**
 * 使用java 内置 Observable 实现主题功能
 * 注意 Observable 是一个超类 不是接口
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
    }

    public void measurementsChanged() {
        // Observable方法 申明主题有数据变更
        setChanged();
        // Observable方法 通知观察者们数据有变更
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }


}
