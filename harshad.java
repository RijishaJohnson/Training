import java.util.*;
class Main{
public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			int sum=0;
			int n=scan.nextInt();
			int b=n;
			while(n>0) {
				int digit=n%10;
				n=n/10;
				sum=sum+digit;
			}
			System.out.println("sum="+sum);
				if(n%sum==0)
		{
			System.out.println("yes,it is a harshad number");
		}
		else
		{
		    System.out.println("no,it is not a harshad number");
		}
	
		}

}
