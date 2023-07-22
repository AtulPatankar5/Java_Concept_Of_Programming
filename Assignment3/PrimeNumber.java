package Assignment3;

import java.util.Scanner;

class PrimeNumber {

	public static void isPrime(int num1, int num2)
	{
		
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
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1=sc.nextInt();
		System.out.print("Enter number 2: ");
		int num2=sc.nextInt();
		// 2 50
		isPrime(num1,num2);
		
		sc.close();	
	}
}
