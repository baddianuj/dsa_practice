package introduction.interfaces.practice;

import introduction.interfaces.Engine;

public class Bike implements Vehicle, EngineCC {
    @Override
    public void engine() {
        System.out.println("Bike has 1100cc");
    }

    @Override
    public void start() {
        System.out.println("Bike has started");
    }

    @Override
    public void stop() {
        System.out.println("Bike has stopped");
    }
}
