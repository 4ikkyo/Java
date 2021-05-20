import java.io.*;

public class Two {
        public static void main(String[] args) 
        throws IOException 
        {
            try 
            {
            BufferedReader in = new BufferedReader(new FileReader("Java/Project2/src/a2.txt"));
            String s = in.readLine();
            String[] strScores = s.split(" ");
            int sum1 = 0;
            int sum2 = 0;
            double h1=0;
            double h2=0;
            int[] x = new int[30];
            int[] y = new int[30];
            
            for(int j=0,i=0;i<30;j++,j++,i++){                      //ввод чисел в массив x
                x[i] = Integer.parseInt(strScores[j]);
            }
    
            for(int j=1,i=0;i<30;j++,j++,i++){             //ввод чисел в массив y
                y[i] = Integer.parseInt(strScores[j]);
            }
            
            System.out.print("Массив x: ");
            
            for (int j = 0; j < x.length; j++) {        //вывод массив x
                System.out.print(x[j] + " ");
            }
    
            System.out.print("\nМассив y: ");
            
            for (int j = 0; j < y.length; j++) {       //вывод массив y
                System.out.print(y[j] + " ");
            }
            
            for (int i = 0; i < x.length; i++, i++) { //счет x1*y1+x3*y3+x5*y5...
                sum1 = x[i] * y[i];
                h1 += sum1;
            }
    
            System.out.println("\n\nx1*y1+x3*y3+x5*y5... = "+h1);
    
            for (int i = 1; i < y.length; i++, i++) { //счет x2*y2+x4*y4+x6*y6...
                sum2 = x[i]*y[i];
                h2 += sum2;
            }
    
            System.out.println("x2*y2+x4*y4+x6*y6... = "+h2);
        
            System.out.println("------------------------------\n"+h1 / h2); //Вывод
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Файл не надйен");
            }
        }
}
