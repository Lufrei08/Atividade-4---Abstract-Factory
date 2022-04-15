package com.mycompany.abstractfactorypens;

public interface IPenFactory {

    public IBallpointPen createBallpointPen();

    public IRollerballPen createRollerballPen();
}
