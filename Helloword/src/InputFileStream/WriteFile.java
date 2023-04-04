package InputFileStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String content;
        File file = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to write into file: ");
        content=sc.nextLine();
        try {
            file = new File("C:\\data\\data.txt.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
    }
}
