import java.util.Arrays;

public class StudentOp {
    public static void main(String[] args) {
       Students s1[]=new Students[]{

            new Students(11, "Sam", new int[]{100, 50, 40, 30, 80, 60}),

            new Students(12, "Som", new int[]{90, 50, 70, 90, 80, 95}),

            new Students(13, "Smita", new int[]{90, 50, 90, 90, 95, 95}),

            new Students(14, "Teju", new int[]{100, 90, 70, 90, 80, 95}),

            new Students(15, "Vishu", new int[]{60, 80, 30, 40, 50, 100}),

            new Students(16, "Suhas", new int[]{50, 90, 80, 50, 65, 95}),

            new Students(17, "Kriti", new int[]{75, 50, 70, 94, 88, 40}),

            new Students(18, "Suma", new int[]{57, 90, 87, 75, 82, 75}),

            new Students(19, "Rakshit", new int[]{94, 50, 80, 56, 74, 95}),

            new Students(20, "Raghu", new int[]{90, 50, 60, 88, 80, 95})
        };
       for (int i=0; i< s1.length; i++){
           System.out.println(s1[i]);

       }



        }

    }


class Students {
    int rollNo;
    String name;
    int[] marks;

    Students(){
    }

    public Students(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
