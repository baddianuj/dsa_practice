package introduction.interfaces.practice;

public class Main {
    public static void main(String[] args) {

        Vehicle bike = new Bike();
        EngineCC bikeEng = (EngineCC) bike;

        Vehicle car = new Car();
        EngineCC carEng = (EngineCC) car;


        // now this is referencing to the same object
//        Bike b = new Bike();
//        Vehicle bike = b;
//        EngineCC bikeEng = b;
//
//        Car c = new Car();
//        Vehicle car = c;
//        EngineCC carEng = c;


//        Creating multiple objects here
//        Vehicle bike = new Bike();
//        EngineCC bikeEng = new Bike();
//
//        Vehicle car = new Car();
//        EngineCC carEng = new Car();
//
        bike.start();
        bike.stop();
        bikeEng.engine();

        System.out.println("----------------");

        car.start();
        car.stop();
        carEng.engine();
//


    }
}
