import java.util.*;
public class Demo {
		public static void main(String args[]) {
			Scanner scan=new Scanner(System.in);
			int sum=0;
			int n=scan.nextInt();
			int b=n;
			while(n>0) {
				int digit=n%10;
				int fact=1;
				for(int i=1;i<=digit;i++) {
					fact=fact*i;
				}
				n=n/10;
				sum=sum+fact;
			}
			System.out.println("sum="+sum);
		if(b==sum)
		{
			System.out.println("sum is strong");
		}
		else
		{
		    System.out.println("sum is not strong");
		}
	
		}
}

