package DateFunction;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class EmpExp {
    public static void main(String[] args) {
        LocalDate currentDate= LocalDate.now();
        System.out.println("Today's date: " + currentDate);

        LocalDate joiningDate= LocalDate.of(2014,04,20);
        System.out.println("Employee's joining date: " + joiningDate);

        Period experience = Period.between(joiningDate,currentDate);
        System.out.println("Experience of the employee is " + experience.getDays() + "days, " + experience.getMonths() + "month, " + experience.getYears() + "year, ");

        System.out.println(experience);
    }
}
