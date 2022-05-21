package com.company;

public class Battery extends Hydroelectric
{
    int capacity;
    double amountOfEnergy;
    Battery(int capacity,double amountOfEnergy){
        super();
        this.capacity = capacity;
        this.amountOfEnergy = amountOfEnergy;
    }
    double AmountOfEnergyB(){
        amountOfEnergy = energyHydroelectric();
        return amountOfEnergy;
    }






}
