package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayException {


        public String getPriceDetails() {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("enter the size of an array");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("enter the price details");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("enter the index of the array  element you want to access");
                int index = sc.nextInt();
                return "the array element is " + arr[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                return"Array index is out of match";

            } catch (InputMismatchException e1) {
               return "Input was not in the correct format";
            }
        }



    public static void main(String[] args) {
            ArrayException e = new ArrayException();
            System.out.println(e.getPriceDetails());
    }
    }



