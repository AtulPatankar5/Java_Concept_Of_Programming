
package Assignment1;
import java.util.Scanner;


class FactorOfNumber
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number whose factor need to be calculated:");
		int num=sc.nextInt();
		

		System.out.print("Factors are:");

		for(int i=1; i<=num; i++)
		{	
			if( num%i == 0)
			{
				System.out.print(i+ " " );
			}
		}
		sc.close();
	}
}




