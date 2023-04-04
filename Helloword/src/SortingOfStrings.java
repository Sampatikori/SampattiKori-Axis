import java.util.Scanner;

public class SortingOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        //initialize array to store student names
        String[] studentNames = new String[n];
        //prompt user to enter student names
        for (int i=0; i<n; i++){
            System.out.println("enter student " +(i+1)+ "name:");
            studentNames[i] = sc.nextLine();
        }

        //sort the student names in ascending order
        for(int i=0; i<studentNames.length; i++){
            for(int j=i+1; j<studentNames.length; j++){
                if(studentNames[i].compareTo((studentNames[j]))>0){
                    String temp=studentNames[i];
                    studentNames[i]=studentNames[j];
                    studentNames[j]=temp;
                }
            }
        }
        //print the sorted student names
        System.out.println("\nSorted student names in Ascending order.");
        for(int i=0; i<n; i++){
            System.out.println(studentNames[i]);
        }

    }
}
