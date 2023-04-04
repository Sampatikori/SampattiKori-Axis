package InputFileStream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        String data = "The information to be written to the file";
        try {
            fileWriter = new FileWriter("C:\\data\\data.txt.txt");
            fileWriter.write(data);
            System.out.println("The information is written to the file ");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
}
