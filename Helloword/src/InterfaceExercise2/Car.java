package InterfaceExercise2;

public class Car extends MotorisedVehicle implements Vehicle {

    @Override
    public void drive() {
        System.out.println("driving....");

    }

    @Override
    public void turnLeft() {
        System.out.println("turning left....");
    }

    @Override
    public void brake() {
        System.out.println("The car is in brake mode");

    }

}
