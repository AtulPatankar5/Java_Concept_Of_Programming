package Assignment3;

import java.util.Scanner;

class FabonnaciSeries {

	/*
	 * 0 1 1 2 3 5 8 13 
	 */
		

	public static void fabonacciSeries(int num)
	{
		int num1=0;
		int num2=1;
		for(int i=1;i<=num; i++)
		{
			if (i == 1 ) {
				System.out.print(num1 + " ");
			}
			else if( i == 2)
			{
				System.out.print(num2 + " ");
			}
			else if (i>2)
			{
				int sum=num1+num2;
				num1=num2;
				num2=sum;
				System.out.print(sum+ " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter range of fabonacci series :");
		int num=sc.nextInt();
		
		fabonacciSeries(num);
		
		sc.close();
	}

}
