public class GradeExercise {
    public static void main(String[] args) {
        int marks=80;
        if(marks<25) {
            System.out.println("F");
        }
        else if((marks>=25)&&(marks<45)) {
            System.out.println("E");
        }
        else if((marks>=45)&&(marks<50)){
            System.out.println("D");
        }
        else if((marks>=50)&&(marks<60)){
            System.out.println("C");
        }
        else if((marks>=60)&&(marks<80)){
            System.out.println("B");
        }
        else if((marks>=80)&&(marks<=100)){
            System.out.println("A");
        }
        else{
            System.out.println("Not correct marks");
        }


    }
}
