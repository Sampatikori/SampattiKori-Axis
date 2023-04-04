package InterfaceNdAbstract;

public class Main {
    public static void main(String[] args) {

//        MotorizedVehicle m1 = new MotorizedVehicle();
//        m1.brake();
//        m1.drive();
//        m1.turnLeft();
//        m1.checkMotor();

        Vehicle  v = new MotorizedVehicle();
        v.brake();
        v.drive();
        v.turnLeft();


//        PublicTransport p = new PublicTransport();
//        p.brake();
//        p.turnLeft();
//        p.drive();
//        p.display();

        Vehicle  v1 = new PublicTransport();
        v1.turnLeft();
        v1.brake();
        v1.drive();
    }
}
