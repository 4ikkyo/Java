import java.io.*;

public class Three {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new FileReader("Project2/src/f.txt"));
            String s = in.readLine();
            char[] x = s.toCharArray();
            char [] y = new char [80];
            int z=0;

            for (int i=0, j=0; i < 80; i++){
                if (x[i] == '1' | x[i] == '2' | x[i] == '3' | x[i] == '4' | x[i] == '5' | x[i] == '6' | x[i] == '7' | x[i] == '8' | x[i] == '9' | x[i] == '0'){
                    y[j]=x[i];
                    j++;
                    z=j;
                }
            }
            System.out.println(z);
            
            
            for (int i=0, j=z; i < 80-z; i++){
                if (x[i] != '1' & x[i] != '2' & x[i] != '3' & x[i] != '4' & x[i] != '5' & x[i] != '6' & x[i] != '7' & x[i] != '8' & x[i] != '9' & x[i] != '0'){
                    y[j]=x[i];
                    j++;
                }
            }
            
            for (int i=0; i < 80; i++){
            System.out.print(y[i]);
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println("Файл не надйен");
        }
    }
}
