package Assignment1;
import java.util.Scanner;


class SumOfRange
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 numbers whose sum is to be calculated");
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		

		int result=0;
		for(int i=num1; i<=num2; i++)
		{
		
			result= result + i;
		}

		System.out.println("Sum of numbers is:"+ result);

		sc.close();
	}

}




