import java.io.*;

public class One_copy
{

    public static void main(String[] args) 
    throws IOException 
    {
        try
        {
            FileInputStream fileInputStream = new FileInputStream("C:\\VSCode\\Java\\Project2\\src\\a2.txt");
            int i;
            while((i=fileInputStream.read())!= -1)
            {
                System.out.print((char)i);
            }
        }   
        catch (FileNotFoundException e)
        {
            System.out.println("Файл не надйен");
        }

    }
}