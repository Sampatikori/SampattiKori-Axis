package CollectionList;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List vlist =new Vector();
        vlist.add(10);
        vlist.add(20);
        vlist.add(20);
        vlist.add("Sam");
        System.out.println(vlist);
        vlist.add("Som");
        System.out.println(vlist);
        System.out.println(vlist.get(3));
        System.out.println(vlist.contains("Smita"));
        System.out.println(vlist.set(2,"Smita"));
        System.out.println(vlist);
        System.out.println(vlist.indexOf("Sam"));
        System.out.println(vlist.toString());
        System.out.println(vlist.toArray());
        System.out.println(vlist.isEmpty());
        System.out.println(vlist.lastIndexOf("Som"));
        System.out.println(vlist.size());


    }
}
