import java.util.*;
class Main{
    public static void main(String[]args)
    {
        Sub hj=new Sub();
        hj.display();
    }
}
class Sum{
    private int a=1;
    private int b=2;
    public int geta(){ 
 return a;
}
    public int getb(){
 return b;
}
}
class Sub extends Sum 
{
    int c;
    public void display()
    {
        c=geta()+getb();
        System.out.println(c);
        }
}   
