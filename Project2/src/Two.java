import java.io.*;  

class Two {  
    public static void main(String args[]) 
    
    throws IOException  
    {    
        char c;  
        BufferedReader br  = new BufferedReader(new InputStreamReader (System.in));  
        System.out.print("Введіть символи, 'q' для виходу.");  
        // читати символи  
        do 
        {  
            c = (char) br.read();  
            System.out.println(c);
        }   while(c != 'q');   
    }
}