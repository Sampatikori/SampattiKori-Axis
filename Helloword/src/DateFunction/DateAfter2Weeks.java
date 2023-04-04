package DateFunction;

import java.time.LocalDate;
import java.util.Calendar;

public class DateAfter2Weeks {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // Add 2 weeks to Today's  date

        LocalDate afterTwoweeks = today.plusWeeks(2);
        System.out.println("Date after two weeks: " + afterTwoweeks) ;
    }

}
