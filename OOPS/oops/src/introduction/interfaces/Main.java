package introduction.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();

//        Engine car = new Car(); // when took the reference as Engine , that inferface doestn hace brake
        // thats why i need it to cast (Car) to the object
//        car.start();
//        car.acc();
//        ((Car) car).brake(); // needed to cast when i take the Engine reference
//        car.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine(new ElectricEngine());

    }
}
