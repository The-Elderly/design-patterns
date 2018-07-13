package com.chaoyue.design.patterns.chapter2.version1;

/**
 * 观察者模式 Observer Pattern（version1 手动实现）
 * 定义了对象之间的一对多依赖（1表示主题 多表示观察者）这样一来，当一个对象改变状态时，所有的依赖者都会收到通知并自动更新
 * <p>
 * demo 说明
 * WeatherData 气象数据为主题
 * CurrentConditionsDisplay 展示终端为观察者
 * WeatherData 数据发生变更时，调用CurrentConditionsDisplay.update()方法进行更新
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
        // 观察者取消订阅主题 主题数据再次变化，观察者的数据不再更新
        System.out.println("cancel observe");
        display.getWeatherData().removeObserver(display);
        System.out.println("data changed");
        weatherData.setMeasurements(6.6f, 7.7f, 8.8f);
    }
}
