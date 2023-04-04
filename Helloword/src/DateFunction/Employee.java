package DateFunction;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
   private int emp_id;
   private String name;

   private LocalDate doJ;


    public Employee() {
    }

    public Employee(int emp_id, String name, LocalDate doJ) {
        this.emp_id = emp_id;
        this.name = name;
        this.doJ = doJ;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoJ() {
        return doJ;
    }

    public void setDoJ(LocalDate doJ) {
        this.doJ = doJ;
    }

    public static void main(String[] args) {

        Employee emp[]=new Employee[]{
                (new Employee(1, "Sanvi", LocalDate.of(2000, 10, 1))),
                (new Employee(1, "Trisha", LocalDate.of(2012, 2, 10))),
                (new Employee(1, "Mouna", LocalDate.of(2005, 5, 5))),
                (new Employee(1, "Vishu", LocalDate.of(2011, 11, 10))),
                (new Employee(1, "Raj", LocalDate.of(2014, 4, 2))),
                (new Employee(1, "Suhas", LocalDate.of(2016, 8, 20))) };


        LocalDate currentDate=LocalDate.now();
        int maxYears = 0;
        int maxMonths = 0;
        int maxDays = 0;
        String mostExpEmp = " ";

        for (int i=0; i< emp.length; i++){
            Period period = Period.between(emp[i].getDoJ(),currentDate);
            int years = period.getYears();
            int month = period.getMonths();
            int day = period.getDays();
            System.out.println(emp[i].getName() + " has " + years + " years, " + month + " months, " + day + " days, " + " of Experiencs ");

            if(years>maxYears || (years == maxYears && month>maxMonths) || (years==maxYears && month==maxMonths && day>maxDays)){
                maxYears = years;
                maxMonths = month;
                maxDays = day;
                mostExpEmp = " id= " + emp[i].getEmp_id() + " name= " + emp[i].getName() + " doj=nn " + emp[i].getDoJ();
            }
        }
        System.out.println("most experienced employee" + mostExpEmp);
    }


    }
