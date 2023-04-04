package Exercise3;

public class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance =250.80 ;
    double hra =-1000.50;

    public Employee() {
    }

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;

    }

    void calculateSalary(){
        double salary;
        salary = (basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100));
        System.out.println("calculated salary is " + salary);


    }
    void calculateTransportAllowance(){
        double transportAllowance;
        transportAllowance = 10*(basicSalary/100);
        System.out.println("calculated transport allowance is "+transportAllowance);

    }
}
