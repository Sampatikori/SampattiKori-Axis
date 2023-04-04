package InterfaceNdAbstract;

public class PublicTransport implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Driving....");

    }

    @Override
    public void turnLeft() {
        System.out.println("turning left...");


    }

    @Override
    public void brake() {
        System.out.println("brake used...");

    }

    void display(){
     System.out.println("Displaying....");
    }
}
