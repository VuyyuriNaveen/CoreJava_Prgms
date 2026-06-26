package Pack;
import java.io.*;
public class ReadThreeLines {
   public static void main(String[] args) {
       String filePath = "C:/Users/DAC-User18/Desktop/Java_AC/dabc.txt";
       try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
           for (int i = 0; i < 3; i++) {
               String line = br.readLine();
               if (line == null) break;
               System.out.println(line);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
}