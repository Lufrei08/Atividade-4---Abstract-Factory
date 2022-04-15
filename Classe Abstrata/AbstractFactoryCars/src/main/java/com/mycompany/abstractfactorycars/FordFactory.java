package com.mycompany.abstractfactorycars;

public class FordFactory extends CarFactory {

    public SUV createSUV() {
        return new Edge();
    }

    public Hatch createHatch() {
        return new Fiesta();
    }
    
    public Sport createSport(){
        return new Mustang();
    }

}
