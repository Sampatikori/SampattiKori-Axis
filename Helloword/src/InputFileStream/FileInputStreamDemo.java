package InputFileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        StringBuffer content = null;
        FileInputStream fileStream = null;
        int ch;
        int vowelCount=0,spaceCount=0,digits=0;
        try {
            fileStream = new FileInputStream("C:\\data\\data.txt.txt");
            content = new StringBuffer();
            while ((ch = fileStream.read()) != -1) {
                content.append((char) ch);
                if(ch=='a'|| ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                    vowelCount++;
                }
                if(ch==' '){
                    spaceCount++;
                }
                if(ch>= '0' && ch<='9'){
                    digits++;
                }
            }
        } catch (FileNotFoundException fileNotFound) {
            fileNotFound.printStackTrace();
        } catch (IOException ioexp) {
            ioexp.printStackTrace();
        } finally {
            try {
                System.out.println(content);
                System.out.println("number of vowels in a file : "+vowelCount);
                System.out.println("number of spaces in a file : "+spaceCount);
                System.out.println("number of digits in a file : "+digits);
                fileStream.close();
            } catch (IOException ioexp) {
                ioexp.printStackTrace();
            }
        }

    }
}


