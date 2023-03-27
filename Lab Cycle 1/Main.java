import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the matrix:");
		int m=t.nextInt();
		int n=t.nextInt();
		int[][]	matrix=new int[m][n];
		System.out.println("Enter the elements to the matrix");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				int element=t.nextInt();
				matrix[i][j]=element;
			}
		}
		System.out.println("The matrix is: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("\n");
		}
		System.out.println("The transposed matrix is: ");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println("\n");
		}
		boolean symmetry=true;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j]!=matrix[j][i])
				{
					symmetry=false;
					break;
				}
				
			}
		}
		if(symmetry)
		{
			System.out.println("The matrix is symmetric.");	
		}
		else
		{
			System.out.println("The matrix is not symmetric.");
		}
	}
}
