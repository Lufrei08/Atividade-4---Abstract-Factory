package com.mycompany.abstractfactorypens;

public class CompactorFactory implements IPenFactory {

    public IBallpointPen createBallpointPen() {
        return new Senator();
    }

    public IRollerballPen createRollerballPen() {
        return new Microline();
    }
}
