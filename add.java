import java.util.*;
class Main {
    public static void main(String[] args) {
      Add obj=new Add();
      obj.sum();
    }
}
class Add{
    private int a,b,c;
    public void sum(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the a value:");
        a=in.nextInt();
         System.out.print("Enter the b value:");
        b=in.nextInt();
        c=a+b;
        System.out.println("sum="+c);
    }
}
