package com.company;

public class Main
{
    public static void main(String[] args)
    {
        //SolarPanel
        SolarPanel num = new SolarPanel("Ясно",2.0,3.0);
        System.out.println("Вироблена енергія панелями - "+ num.energySolarPanel());
        //Перевизначений метод(Тип даних)
        System.out.println("Вироблена енергія панелями - "+ num.energySolarPanel(2,3));
        num.square(5.1,7.8);
        //Перевизначений метод(Логіка)
        num.square(3,4);
        //NuclearPowerPlant
        NuclearPowerPlant num2 = new NuclearPowerPlant(8,2,2);
        System.out.println("Забруднення атмосфери -  " + num2.atmosphericPollution(1.0,12));
        //Перевизначений метод(Тип даних)
        System.out.println("Забруднення атмосфери -  " + num2.atmosphericPollution(1,12));
        num2.efficiency();
        //Перевизначений метод(Логіка)
        num2.efficiency(2,8);
        //Hydroelectric
        //Перевизначення конструктора 4-ма способами
        Hydroelectric num3 = new Hydroelectric(1.0,2.0,3.0);
        Hydroelectric num3_2 = new Hydroelectric(1);
        Hydroelectric num3_3 = new Hydroelectric(num3);
        Hydroelectric num3_4 = new Hydroelectric();
        num3_4.powerH = 3.0;
        num3_4.speedH = 2.0;
        num3_4.generatorEfficiencyH = 1.0;
        System.out.println("Вироблена енергія Гідроелектростанцією - " + num3.energyHydroelectric());
        //Перевизначений метод(Тип даних)
        System.out.println("Вироблена енергія Гідроелектростанцією - " + num3.energyHydroelectric(1,2,3));
        num3.noiseExposure(1.0,3.0);
        //Перевизначений метод(Логіка)
        num3.noiseExposure(1,3);
    }
}
