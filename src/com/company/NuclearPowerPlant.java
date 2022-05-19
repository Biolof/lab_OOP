package com.company;

class NuclearPowerPlant
{
    private int timeN;
    private int powerUnitN;
    private double powerN;

    NuclearPowerPlant(int time, int powerUnit, double power) {
        this.timeN = time;
        this.powerUnitN = powerUnit;
        this.powerN = power;
    }
    double atmosphericPollution(double emissionsPerDay, int day) {
        double pollution = emissionsPerDay * day;
        return pollution;
    }
    //Перевизначений метод(Тип даних)
    int atmosphericPollution(int emissionsPerDay, int day) {
        int pollution = emissionsPerDay * day;
        return pollution;
    }
    void efficiency() {
        double d = powerN/timeN*100;
        System.out.println("Ефективність реактора - " + d);
    }
    //Перевизначений метод(Логіка)
    void efficiency(int power,int time) {
        double energyProduced = power*time;
        System.out.println("Вироблена енергія - " + energyProduced);
    }
    //Гетери і Сетери
    public int getTimeN() {
        return timeN;
    }
    public void setTimeN(int time) {
        this.timeN = time;
    }
    public double getPowerUnitN() {
        return powerUnitN;
    }
    public void setPowerUnitN(int powerUnit) {
        this.powerUnitN = powerUnit;
    }
    public double getPowerN() {
        return timeN;
    }
    public void setPowerN(double power) {
        this.powerN = power;
    }
}