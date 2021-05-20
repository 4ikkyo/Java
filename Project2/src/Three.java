import java.io.*;

public class Three {
        public static void main(String[] args) 
        throws IOException 
        {
            try 
            {
            BufferedReader in = new BufferedReader(new FileReader("Java/Project2/src/a2.txt"));
            char s = (char) in.read();
            char[] strScores = new char[80];
            int sum1 = 0;
            int sum2 = 0;
            double h1=0;
            double h2=0;
            char[] x = new char[80];
            int[] y = new int[30];
            
            
            for(int i=0;i<80;i++){
                if (s == 1 || s == 2 || s == 3 || 
                    s == 4 || s == 5 || s == 6 || 
                    s == 7 || s == 8 || s == 9){
                        x[i] =  s;
                    }                      //ввод чисел в массив x
            }
            for(int i=0;i<80;i++){
                if (s != 1 || s != 2 || s != 3 || 
                    s != 4 || s != 5 || s != 6 || 
                    s != 7 || s != 8 || s != 9){
                        x[i] =  s;
                    }                      //ввод чисел в массив x
            }
             System.out.println(x[40]);
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Файл не надйен");
            }
        }
}
