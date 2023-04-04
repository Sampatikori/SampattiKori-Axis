package InputFileStream.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        FileReader fileReader=null;

        try{
            fileReader=new FileReader("C:\\data\\data.txt.txt");
            int chars;
            while ((chars=fileReader.read())!=-1){
                System.out.println((char) chars);
            }
        } catch (FileNotFoundException filene) {
            filene.printStackTrace();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }finally {
            try{
                fileReader.close();
            }catch (IOException ioe) {
                ioe.printStackTrace();

            }
        }
    }
}
