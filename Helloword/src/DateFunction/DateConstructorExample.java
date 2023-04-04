package DateFunction;

import java.util.Date;

public class DateConstructorExample {
    public static void main(String[] args) {

        Date defaultdate = new Date();
        System.out.println("Default Date: " + defaultdate);

        Date millisDate = new Date(1616974341000L);
        System.out.println("Date from milliseconds: " + millisDate);

        Date ymdDate = new Date(2000,7,14);
        System.out.println("Date from year, month, and day: " + ymdDate);

        Date ymdhmsDate = new Date(2000,7,14,6,40);
        System.out.println("Date from year, month, day, hour, minute, seconds: " + ymdhmsDate);
    }
}
