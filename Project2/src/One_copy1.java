import java.io.*;  

class One_copy1 {  
    public static void main(String args[]) 
    
    throws IOException  
    {    
        char [] c = new char [1];  
        BufferedReader br  = new BufferedReader(new InputStreamReader (System.in));  
        System.out.print("Введіть символи, 'q' для виходу.");  
        // читати символи  
        do 
        {  
            c[1] = (char) br.read();  
            System.out.println(c);
        }   while(c[1] != 'q');   
    }
}