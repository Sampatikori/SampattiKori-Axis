package Exception;

import java.util.Scanner;

public class MainForCandidate {
   public static Candidate getCandidateDetails() throws InvalidSalaryException {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the candidate details");
       System.out.println("enter candidate name");
       String name = sc.nextLine();
       System.out.println("Gender");
       String gender = sc.nextLine();
       System.out.println("Expected Salary:");
       double expectedSalary = sc.nextDouble();

       if(expectedSalary<10000){
           throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
       }
       return new Candidate(name,gender, expectedSalary);
   }

    public static void main(String[] args) throws InvalidSalaryException {
       try {


           Candidate candidate = getCandidateDetails();
           if (candidate != null) {
               System.out.println("Registration Successfull");
           }
       }catch (InvalidSalaryException e){
           System.out.println(e.getMessage());
       }
    }
}
