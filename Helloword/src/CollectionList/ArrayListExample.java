package CollectionList;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Sam");
        System.out.println(list);
        list.add(2,"Vishu");
        System.out.println(list);
        list.get(3);
        System.out.println(list);
        list.toArray();
        System.out.println(list);
        list.contains(20);
        System.out.println(list);
        list.indexOf("Vishu");
        System.out.println(list);
        list.iterator();
        System.out.println(list);
        list.lastIndexOf(list);
        System.out.println(list);
        list.remove("Vishu");
        System.out.println(list);
        list.size();
        System.out.println(list);
        list.retainAll(list);
        System.out.println(list);
        list.set(2,"Kori");
        System.out.println(list);
        list.hashCode();
        System.out.println(list);
        list.equals(20);
        System.out.println(list);




    }
}
