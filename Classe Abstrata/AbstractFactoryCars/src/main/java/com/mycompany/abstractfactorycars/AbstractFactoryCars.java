package com.mycompany.abstractfactorycars;

public class AbstractFactoryCars {

    public static void main(String[] args) {

        CarFactory fordFactory = new FordFactory();
        SUV fordSUV = fordFactory.createSUV();
        Hatch fordHatch = fordFactory.createHatch();
        Sport fordSport = fordFactory.createSport();

        fordSUV.viewInfo();
        fordHatch.viewInfo();
        fordSport.viewInfo();

        CarFactory peugeotFactory = new PeugeotFactory();
        SUV peugeotSUV = peugeotFactory.createSUV();
        Hatch peugeotHatch = peugeotFactory.createHatch();
        Sport peugeotSport = peugeotFactory.createSport();

        peugeotSUV.viewInfo();
        peugeotHatch.viewInfo();
        peugeotSport.viewInfo();

    }
}
