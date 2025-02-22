import java.util.*;
class Main{
public static void main(String[]args){
Shape s1=new Square();
s1.calculate_area();
Shape s2=new Circle();
s2.calculate_area();
}
}
class Shape{
  protected double area;
public void calculate_area(){
System.out.print("Area of Shapes");
}
}
class Square extends Shape{
private int a;
public void calculate_area(){
Scanner in=new Scanner(System.in);
 System.out.print("Enter the a value:");
a=in.nextInt();
area=a*a;
System.out.println("Area of the Square:"+area);
}
}
class Circle extends Shape{
private double r;
public void calculate_area(){
Scanner in=new Scanner(System.in);
System.out.print("Enter the value of r:");
r=in.nextDouble();
area=r*3.14*r;
System.out.println("Area of the Circle:"+area);
}
}
