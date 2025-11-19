package introduction.interfaces.practice;

public class Car implements Vehicle, EngineCC{
    @Override
    public void start(){
        System.out.println("Starting the Car");
    }

    @Override
    public void stop(){
        System.out.println("Stopping the car");
    }

    @Override
    public void engine() {
        System.out.println("Car has 4951cc ");
    }
}
