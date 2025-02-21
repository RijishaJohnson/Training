import java.util.*;
class Main{
    public static void main(String args[]){
        Calculator add=new Calculator();
        add.addition();
         Calculator sub=new Calculator();
         System.out.println("The differnce value:"+sub.subtraction());
        Calculator pro=new Calculator();
          pro.product(13,6);
        Calculator div=new Calculator();
          System.out.println("The division value:"+div.division(134,2));
    }
}
class Calculator{
    public void addition(){
        int a=17;
        int b=14;
        int c=a+b;
        System.out.println("The Addition value:"+ c);
    }
    public int subtraction(){
        int d=133;
        int e=98;
        int f=d-e;
        return f;
    }
    public void product(int g,int h){
      
        int i=g*h;
        System.out.println("The Product:"+ i);
        
    }
    public int division(int j,int k){
        int l= j/k;
        return l;
    }
}
