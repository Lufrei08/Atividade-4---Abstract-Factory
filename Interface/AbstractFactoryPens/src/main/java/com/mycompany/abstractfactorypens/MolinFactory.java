package com.mycompany.abstractfactorypens;

public class MolinFactory implements IPenFactory{

    @Override
    public IBallpointPen createBallpointPen() {
        return new ACode();
    }

    @Override
    public IRollerballPen createRollerballPen() {
        return new Jumbo();
    }

}
