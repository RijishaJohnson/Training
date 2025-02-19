import java.util.*;
class Main      
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the row value:");
		int row=in.nextInt();
		System.out.print("Enter the column value:");
		int col=in.nextInt();
		int[][] mat=new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print("Enter the Value of["+i+","+j +"]:");
				mat[i][j]=in.nextInt();
			}
		}
		System.out.println("The Matrix:");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{

				System.out.print(" " +mat[i][j]+ " ");
			}
			System.out.println();

		}
	}

}
