package Assignment1;
import java.util.Scanner;


class PrimeNumber
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter set of numbers between which Primenumber need to be calculated");
		System.out.print("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.print("Enter num2:");
		int num2=sc.nextInt();
		

		System.out.print("Prime Numbers are:");

		for(int i=num1; i<=num2; i++)
		{
			int count=0;

			for( int j=1; j<=i; j++)
			{
			
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.print( " "+ i + " ");
			}
		}
		sc.close();
	}

}




