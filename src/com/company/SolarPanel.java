package com.company;

class SolarPanel
{
    private String weatherS;
    private double timeS;
    private double powerS;
    SolarPanel(String weather, double time, double power) {
        this.weatherS = weather;
        this.timeS = time;
        this.powerS = power;
    }
    public SolarPanel() {

    }
    double energySolarPanel(){
        double a = timeS * powerS;
        return a;
    }
    //Перевизначений метод(Тип даних)
    int energySolarPanel(int time, int power){
        int a = time * power;
        return a;
    }
    void square(double length,double width){
        double s = length*width;
        System.out.println("Площа пенелей - " + s);
    }
    //Перевизначений метод(Логіка)
    void square(int length,int width){
        int s = length*width;
        if (s>300)
            System.out.println("Ваша сонячна станція є великою");
        else
            System.out.println("Ваша сонячна станція є маленькою");
    }
    //Гетери і Сетери
    public String getWeatherS() {
        return weatherS;
    }
    public void setWeatherS(String weather) {
        this.weatherS = weather;
    }
    public double getTimeS() {
        return timeS;
    }
    public void setTimeS(double time) {
        this.timeS = time;
    }
    public double getPowerS() {
        return powerS;
    }
    public void setPowerS(double power) {
        this.powerS = power;
    }
}