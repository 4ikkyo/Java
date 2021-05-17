import java.io.*;
import java.util.*;

public class Three {
    public static void main(String[] args) {
        System.err.print(Arrays.toString(test()));
    }
    private static char[] test(){  
        StringBuilder sb = new StringBuilder();
        try( BufferedReader br = new BufferedReader(new FileReader("C:\\VSCode\\Java\\Project2\\src\\a2.txt"))) {
            String str;
            while( (str = br.readLine()) != null){
                sb.append(str);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
           return sb.toString().toCharArray();
        }
       return sb.toString().toCharArray();
    }
}