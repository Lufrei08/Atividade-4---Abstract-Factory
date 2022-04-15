package com.mycompany.abstractfactorycars;

public class PeugeotFactory extends CarFactory {

    public SUV createSUV() {
        return new P3008();
    }

    public Hatch createHatch() {
        return new P208();
    }

    public Sport createSport() {
        return new Rcz();
    }

}
