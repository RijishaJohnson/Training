import java.util.*;
class Book{
    String Title;
    int price;
    Book(){
        price=100;
        System.out.println("java programming");
    }
    void display()
    {
        System.out.print("Price="+price);
        
    }
    public static void main(String args[])
    {
        Book b=new Book();
        b.display();
    }
}
