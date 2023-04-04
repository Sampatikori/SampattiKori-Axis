package Exercise3;

public class InheritanceActivity {
    public static void main(String[] args) {

        Manager m = new Manager(126534,"Peter","Chennai India",237844,65000.00);

        m.calculateSalary();
        m.calculateTransportAllowance();


        Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000.00);

        t.calculateSalary();
        t.calculateTransportAllowance();




    }
}
