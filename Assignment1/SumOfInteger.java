package Assignment1;
import java.util.Scanner;


class SumOfInteger
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter num:");
		int num=sc.nextInt();
		
		if(num<0)
		{
		num=-num;
		}


		int sum=0;
		while(num!=0)
		{
			int newnum=num%10;
			sum=sum+newnum;
			num=num/10;
		}

		System.out.println("Sum of numbers is:"+ sum);
		sc.close();
	}

}



