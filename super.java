import java.util.*;
class Main{
    public static void main(String []args)
    {
        Super obj=new Sub();
        obj.display();
    }
}
class Super{
    static void display()
    {
        System.out.println(" in super class");
    }
}
class Sub extends Super{
    static void display() 
    {
        System.out.println("in sub class");
        
    }
}
