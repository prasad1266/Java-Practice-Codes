import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) {

        String filePath = "D:\\file1.xlsx";
        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)){
           int data;
            StringBuilder content = new StringBuilder();
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data); // Output each byte as a character
            }
        }
        
        
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
