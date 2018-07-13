package com.chaoyue.design.patterns.chapter2.version2;

/**
 * 观察者模式（version2 使用java内置的Observable和Observer实现）
 * demo 说明
 * 与version1的区别为观察者只收到主题数据变更的通知，观察者收到变更通知后去拉取主题的数据
 */
public class WeatherStation {
    public static void main(String[] args) throws InterruptedException {
        // 初始化主题
        WeatherData weatherData = new WeatherData();
        // 初始化观察者
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        // 主题内容发生变化 观察者可以直接接收到主题发送的推送
        weatherData.setMeasurements(1.1f, 2.2f, 3.3f);
        Thread.sleep(1000);
        System.out.println("data changed");
        weatherData.setMeasurements(4.4f, 5.5f, 6.6f);
        Thread.sleep(1000);
        // 观察者取消订阅主题 主题数据再次变化，观察者的数据不再更新(注意与version1中的取消注册方式不大一致)
        System.out.println("cancel observe");
        display.getObservable().deleteObserver(display);
        System.out.println("data changed");
        weatherData.setMeasurements(6.6f, 7.7f, 8.8f);
    }
}
