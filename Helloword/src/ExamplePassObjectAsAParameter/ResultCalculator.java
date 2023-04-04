package ExamplePassObjectAsAParameter;

public class ResultCalculator {
    public Result calculateResult(Student student){
        int total = student.mark1 + student.mark2;
        Result result = new Result();
        result.studentId = student.studentId;
        if((total /2)<60){
            result.grade = "fail";
        }else {
            result.grade = "pass";
        }
        return result;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.mark1=60;
        s.mark2=80;
        s.studentId="3PD18IP020";

        ResultCalculator r=new ResultCalculator();
      System.out.println(r.calculateResult(s));


    }


}
