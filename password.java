import java.util.*;
class Main{
public static void main(String []args){
Scanner in=new Scanner(System.in);
System.out.print("Enter the Password: ");
String s=in.nextLine();
boolean length=false;
boolean Digit=false;
boolean sletter=false;
boolean cletter=false;
boolean special=false;

if(s.length()>8){
   length=true;
  }
for(int i=0;i<s.length();i++){
char c=s.charAt(i);

if(c>='0'&& c<='9'){
 Digit=true;
}
else if(c>='a' && c<='z'){
 sletter=true;
}
else if(c>='A' && c<='Z'){
 cletter=true;
}
else{
 special=true;
}
}

if(length&& Digit &&sletter&& cletter &&special ){
System.out.print("Strong Passsword");
}
else{
System.out.print("no,Create a Strong Password");
}
}
}
