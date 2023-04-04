package CollectionList;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        StudentObj ob = new StudentObj();
        for (int i=0; i<5; i++){
            list.add(ob.stu[i]);
        }

//displaying with for each loop
        for (Student std:list) {
            System.out.println(list);
        }
//        after converting list to String
        list.toString();
        System.out.println(list);

//        after converting list to array
        Object ls[] = list.toArray();
        for(int i=0; i<ls.length; i++) {
            System.out.println(ls[i]);
        }

//        System.out.println(list.sort());
//       Iterator itr =list.iterator();
//       while (itr.hasNext()){
//           System.out.println(itr.next());
//       }

        }
    }

