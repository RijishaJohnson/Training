import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int a=in.nextInt();
    int b=in.nextInt();
    float c=in.nextFloat();
    
    Outer.Area5.area(a,b);
     Outer.Area5.area(a);
     Outer.Area5.area(c);
  }
}
class Outer{
 static class Area5{
  static int a;
 static  int b;
 static float c;
 static int Rectangle;
static  int Circle;
static  float Square;
static  int pi=3;
  static void area(int a,int b){
    Rectangle=a*b;
    System.out.println("rectangle="+Rectangle);
  }
  static void area(int a){
    Circle=a*pi*a;
     System.out.println("circle="+Circle);
  }
  static void area(float c){
    Square=c*c;
    System.out.println("Square="+Square);
  }
}
}
