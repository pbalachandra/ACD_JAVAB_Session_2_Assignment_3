package session2;

public class ACD_JAVAB_Session_2_Assignment_3_Main 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		for (i = 1; i <=5; i++)
		{
			for (j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for (k = 4; k>=1; k--)
		{
			for (j=1; j<=k; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/* OUTPUT
1
12
123
1234
12345
1234
123
12
1
*/