package com.mycompany.abstractfactorypens;

public class AbstractFactoryPens {

    public static void main(String[] args) {
        IPenFactory bicFac = new BicFactory();
        IPenFactory compactorFac = new CompactorFactory();
        IPenFactory molinFac = new MolinFactory();

        IBallpointPen pen1 = bicFac.createBallpointPen();
        IRollerballPen pen2 = bicFac.createRollerballPen();

        IBallpointPen pen3 = compactorFac.createBallpointPen();
        IRollerballPen pen4 = compactorFac.createRollerballPen();

        IBallpointPen pen5 = molinFac.createBallpointPen();
        IRollerballPen pen6 = molinFac.createRollerballPen();

        pen1.viewInfo();
        pen2.viewInfo();
        pen3.viewInfo();
        pen4.viewInfo();
        pen5.viewInfo();
        pen6.viewInfo();
    }
}
