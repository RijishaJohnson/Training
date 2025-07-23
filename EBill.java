import java.util.*;
class Main3{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
System.out.print("Enter the Name: ");
String s=in.nextLine();
System.out.print("Enter the Nunmber: ");
int n=in.nextInt();
System.out.print("Enter the unit Current: ");
int m=in.nextInt();
in.nextLine();
System.out.print("Type :");
String t=in.nextLine().toLowerCase();
int total=0;

if(t.equals("normal") && m>100){
total=5*m;
System.out.println("Total Unit: "+total);
}
else if(t.equals("commercial") && m>100){
total=10*m;
System.out.println("Total Unit: "+total);
}
else{
System.out.print("no Fees");
}
 System.out.print("The Amount to pay is");
if(total>100 && total<500){
System.out.println("RS.150");
}
 else if(total>=500 && total<1000){
System.out.println("RS.300");
}

else if(total>=1000 && total<1500){
System.out.println("RS.450");
}

else if(total>=1500 && total<2000){
System.out.println("RS.600");
}

else if(total>=2000 && total<2500){
System.out.println("RS.750");
}
else if(total>=2500 && total<3000){
System.out.print("RS.900");
}

else if(total>=3000 && total<3500){
System.out.println("RS.1050");
}

else if(total>=3500 && total<4000){
System.out.println("RS.1200");
}

else if(total>=4000 && total<4500){
System.out.println("RS.1350");
}

else if(total>=4500 && total<5000){
System.out.println("RS.1500");

}
else{
System.out.print("0");
}
}
}
