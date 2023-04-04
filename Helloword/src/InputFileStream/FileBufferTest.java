package InputFileStream;

import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBufferTest {
    public static void main(String[] args) {
        FileInputStream fileInput = null;
        BufferedInputStream bufInput = null;

        try {
            fileInput= new FileInputStream("C:\\data\\output.txt");
            bufInput=new BufferedInputStream(fileInput);
            byte[] contents = new byte[1024];
            int bytesRead=0;
            String strFileContents;
            while ((bytesRead=bufInput.read(contents))!=-1){
                strFileContents=new String(contents, 0, bytesRead);
                System.out.println("The content of the file read using "+ "BufferedInputStream is :" + strFileContents);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }finally {
            try{
            bufInput.close();
        } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
