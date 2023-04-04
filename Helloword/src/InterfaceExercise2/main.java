package InterfaceExercise2;

public class main {
    public static void main(String[] args) {
        Vehicle v= new Car();
        v.drive();
        v.brake();
        v.turnLeft();
        MotorisedVehicle m=new Car();
        m.checkMotor();

        v= new Train();
        v.turnLeft();
        v.brake();
        v.drive();
        PublicTransport p = new Train();
        p.getNumberOfPeople();

        Car c = new Car();
        c.brake();
        c.drive();
        c.turnLeft();
        c.checkMotor();

        Train t = new Train();
        t.brake();
        t.drive();
        t.turnLeft();
        t.getNumberOfPeople();



    }
}
