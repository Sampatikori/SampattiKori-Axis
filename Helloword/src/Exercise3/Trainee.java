package Exercise3;

public class Trainee extends Employee{
    public Trainee() {
    }

    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double salary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        super.basicSalary=salary;

    }


    }
