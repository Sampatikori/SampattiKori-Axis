package InputFileStream.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\data\\output.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text : ");
        String input = sc.nextLine();
        try(PrintWriter write = new PrintWriter(fileName)){
            write.write(input);
            System.out.println("File written successfully.");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
