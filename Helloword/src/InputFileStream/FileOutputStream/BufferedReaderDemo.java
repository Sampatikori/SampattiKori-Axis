package InputFileStream.FileOutputStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader =null;
        BufferedReader bufReader =null;
        try{
            fileReader = new FileReader("C:\\data\\output.txt");
            bufReader = new BufferedReader(fileReader);
            String line=null;
            System.out.println("The data which is taken from the file" + "to the buffer is ");
            while ((line=bufReader.readLine()) !=null){
                System.out.println("line");
            }


        } catch (FileNotFoundException fileNF) {
            fileNF.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try{
                fileReader.close();
                bufReader.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
