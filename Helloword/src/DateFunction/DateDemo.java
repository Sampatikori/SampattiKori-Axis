package DateFunction;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Today date is "+ d);
        System.out.println(d.toString());
        System.out.println(d.getTime());
        System.out.println(d.getDay());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMonth());
        System.out.println(d.getMinutes());
        System.out.println(d.getYear());
        System.out.println(d.compareTo(new Date()));
    }
}
