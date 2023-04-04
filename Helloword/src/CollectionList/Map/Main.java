package CollectionList.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MapEx ex1 = new MapEx();
        Map<String,String> studentMap =ex1.getStudentDetails();
        System.out.println(studentMap);
        Set<String> keys = studentMap.keySet();
        Iterator<String> itr = keys.iterator();
        System.out.println("Student Details");
        while (itr.hasNext()){
            String rollNo = itr.next();
            String name = studentMap.get(rollNo);
            System.out.println("Roll No : " + rollNo + " Name : " + name);
        }

    }
}
