import java.util.*;
class Main
{
     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);
         int m;
         int n;                          
         System.out.println("Enter the number of rows:");
         m=in.nextInt();  
         System.out.println("Enter the number of column:");
         n=in.nextInt();  
         int a1[][]=new int[m][n];        
         System.out.println("Enter the elements of the matrix: ");
         for(int i=0;i<m;i++)   
         {
            for(int j=0;j<n;j++)
            {
                 a1[i][j]=in.nextInt();
           }
         }
         System.out.println("The given matrix is: ");
         for(int i=0;i<m;i++)     
         {
           for(int j=0;j<n;j++)
            {
                 System.out.print(a1[i][j]+" ");
             }
            System.out.println("");
        }
        int a2[][]=new int[n][m];        
        for(int i=0;i<n;i++)     
        {
             for(int j=0;j<m;j++)
             {
                 a2[j][i]=a1[i][j];     
             }
        }
           System.out.println("The transpose matrix is:");
        for(int i=0;i<n;i++)     
        {
             for(int j=0;j<m;j++)
             {
                 System.out.print(a2[i][j]+" ");
             }
            System.out.println("");
        }
         
     }
}
