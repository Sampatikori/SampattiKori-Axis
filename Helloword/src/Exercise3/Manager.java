package Exercise3;

public class Manager extends Employee{
    public Manager() {
    }

    public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        super.basicSalary=salary;

    }

    @Override
    void calculateTransportAllowance() {
        double transportAllowance;
        transportAllowance = 15*(basicSalary /100);
        System.out.println(transportAllowance);
    }
}
