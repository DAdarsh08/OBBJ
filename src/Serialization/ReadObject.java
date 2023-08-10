package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
    public static void main(String[] args) {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("book.txt"));
            Book [] book=(Book[])in.readObject();
            in.close();
            for(Book b : book)
                System.out.println(b);
        }catch(IOException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println(ex);

        }
    }
}
