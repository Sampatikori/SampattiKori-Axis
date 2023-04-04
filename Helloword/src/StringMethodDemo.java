import java.util.*;
public class StringMethodDemo {
    public static void main(String[] args) {
        String name = "Sampatti";
        System.out.println("name : " + name);
        System.out.println("3rd character of name : " + name.charAt(2));
        System.out.println("Sampatti compared to Sahana : " + name.compareTo("Sahana"));
        System.out.println("Is Sampatti is equals to sampatti ? : " + name.equals("Sampatti"));
        System.out.println("Length of name : " + name.length());
        System.out.println("Replace a's with v's in name : " + name.replace('a','v'));
      int index = name.indexOf('S');
      System.out.println(index);
      String t = name.substring(2,5);
      System.out.println(t);
      System.out.println(name.substring(4));
      System.out.println(name.toUpperCase());
      System.out.println(name.concat(" Kori"));
        System.out.println(name.contains("v"));

        StringTokenizer tok = new StringTokenizer("Hello Sampatti kori");
        while(tok.hasMoreTokens()){
            System.out.println(tok.nextToken());
        }

    }
}
