package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Book implements java.io.Serializable{
    String bookname;
    String subject;
    int price;

    public Book(String bookname, String subject,int price) {
        this.bookname = bookname;
        this.subject = subject;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", subject='" + subject + '\'' +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args) {
        try {

            Book[] book = {new Book("recursion sutra", "Computer Science", 700), new Book("Hc verma", "physics", 400)};
            ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("book.txt"));
            out.writeObject(book);
            out.flush();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }



    }
}
