import java.util.*;
class Main{
public static void main(String[]args){
String s1="123";
String s2="456";
int n1=0,n2=0;
for(int i=0;i<s1.length();i++){
 n1=n1*10+(s1.charAt(i)-'0');
}
for(int i=0;i<s2.length();i++){
n2=n2*10+(s2.charAt( i)-'0');
}
System.out.print(n1+n2);
}
}
