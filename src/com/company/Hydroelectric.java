

package com.company;

class Hydroelectric
{
    double generatorEfficiencyH;
    double speedH;
    double powerH;
    //Перевизначення конструктора 4-ма способами
    Hydroelectric(double generatorEfficiency, double speed, double power) {
        this.generatorEfficiencyH = generatorEfficiency;
        this.speedH = speed;
        this.powerH = power;
    }
    Hydroelectric(double t) {
        generatorEfficiencyH = speedH = powerH = t;
    }
    Hydroelectric(Hydroelectric hy) {
        generatorEfficiencyH = hy.generatorEfficiencyH ;
        speedH = hy.speedH ;
        powerH = hy.powerH;
    }
    Hydroelectric(){
    }
    double energyHydroelectric() {
        double c = generatorEfficiencyH * powerH * speedH;
        return c;
    }
    //Перевизначений метод(тип даних)
    int energyHydroelectric(int generatorEfficiency, int power, int speed) {
        int c = generatorEfficiency * power * speed;
        return c;
    }
    void noiseExposure(double noiseInsulation, double noise ) {
        double f = noiseInsulation/noise;
        System.out.println("Коефіцієнт впливу шуму на гідроелектростанції - " + f);
    }
    //Перевизначений метод(Логіка)
    void noiseExposure(double noiseInsulation, int noise ) {
        double f = (noiseInsulation/noise)*31;
        System.out.println("Вплив шуму на гідроелектростанції за місяць - " + f);
    }
    //Гетери і Сетери
    public double getGeneratorEfficiencyH() {
        return generatorEfficiencyH;
    }
    public void setGeneratorEfficiencyH(double generatorEfficiency) {
        this.generatorEfficiencyH = generatorEfficiency;
    }
    public double getSpeedH() {
        return speedH;
    }
    public void setSpeedH(double speed) {
        this.speedH = speed;
    }
    public double getPowerH() {
        return powerH;
    }
    public void setPowerH(double power) {
        this.powerH = power;
    }
}

