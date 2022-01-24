import java.util.*;
public class pyramid {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	//	System.out.print("Enter the no of rows:");
	//	int r=sc.nextInt();
	System.out.print("Enter the name:");
		String str= sc.nextLine();
		int l=str.length();
		for( int i=0;i<=l;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
		
