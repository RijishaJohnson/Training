import java.util.*;
class Student{
    String Name;
    String ID;
    void stu()
    {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter the Name:");
    Name=in.nextLine();
    System.out.print("Enter the ID number:");
    ID=in.nextLine();
    System.out.print("Name:" + Name+" "+"ID:"+ID);
}
}
class Main
{
	public static void main(String[] args) {
	Student s=new Student();
	s.stu();
	}
}                                                               