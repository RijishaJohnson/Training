import java.util.*;

class Main{
public static void main(String []args){
Scanner in=new Scanner(System.in);
System.out.print("The 1 value is ");
int k=in.nextInt();
System.out.print("The 2 value is ");
int l=in.nextInt();
System.out.print("The 3 value is ");
int m=in.nextInt();
System.out.print("The 4 value is ");
int n=in.nextInt();

if(k>=l&&k>=m&&k>=n){

 if(k==l&&k==m){
 System.out.print("The value 1,2,3 are same and is Largest");
}
else if(k==m&&k==n){
System.out.print("The value 1,3,4 are same and is Largest");
}
else if(k==l&&k==n){
System.out.print("The value 1,2,4 are same and is Largest");
}
else if(k==l){
 System.out.print(" The value 1 and 2 is same and is Largest");
 }
  else if(k==m){
System.out.print(" The value 1 and 3 is same and is Largest");
 }
 else if(k==n){
System.out.print(" The value 1 and 4 is same and is Largest");
 }
else{
System.out.print("The Largest Value is "+ k);
}

}

else if(l>=k&&l>=m&&l>=n){

if(k==l&&l==m){
 System.out.print("The value 1,2,3 are same and is Largest");
}
else if(l==m&&l==n){
System.out.print("The value 2,3,4 are same and is Largest");
}
else if(k==l&&l==n){
System.out.print("The value 1,2,4 are same and is Largest");
}
 else if(l==k){
 System.out.print(" The value 2 and 1 is same and is Largest");
 }
  else if(l==m){
System.out.print(" The value 2 and 3 is same and is Largest");
 }
 else if(l==n){
System.out.print(" The value 2 and 4 is same and is Largest");
 }
else{
System.out.print("The Largest Value is "+l);
}

}

else if(m>=l&&m>=k&&m>=n){

if(m==l&&k==m){
 System.out.print("The value 1,2,3 are same and is Largest");
}
else if(k==m&&m==n){
System.out.print("The value 1,3,4 are same and is Largest");
}
else if(m==l&&m==n){
System.out.print("The value 2,3,4 are same and is Largest");
}
 else if(m==l){
 System.out.print(" The value 3 and 2 is same and is Largest");
 }
  else if(m==k){
System.out.print(" The value 3 and 1 is same and is Largest");
 }
 else if(m==n){
System.out.print(" The value 3 and 4 is same and is Largest");
 }
else{
System.out.print("The Largest Value is "+m);
}

}

else if(n>=l&&n>=m&&n>=k){

if(n==l&&n==m){
 System.out.print("The value 2,3,4 are same and is Largest");
}
else if(n==m&&n==k){
System.out.print("The value 1,3,4 are same and is Largest");
}
else if(n==l&&n==k){
System.out.print("The value 1,2,4 are same and is Largest");
}
else if(n==l){
 System.out.print(" The value 4 and 2 is same and is Largest");
 }
  else if(n==m){
System.out.print(" The value 4 and 3 is same and is Largest");
 }
 else if(n==k){
System.out.print(" The value 4 and 1 is same and is Largest");
 }
else{
System.out.print("The Largest Value is "+n);
}

}

else if(k==l&&l==m&&n==k){
System.out.print("All are Equal");
}

else{
System.out.print("no");
}

}
}
