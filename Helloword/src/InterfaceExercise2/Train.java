package InterfaceExercise2;

import InterfaceExercise2.PublicTransport;
import InterfaceExercise2.Vehicle;

public class Train implements Vehicle, PublicTransport {
    @Override
    public void getNumberOfPeople() {
        System.out.println("get number of people");
    }

    @Override
    public void drive() {
        System.out.println("driving...");

    }

    @Override
    public void turnLeft() {
        System.out.println("train is turning left");

    }

    @Override
    public void brake() {
        System.out.println("the train is in brake mode");

    }
}
