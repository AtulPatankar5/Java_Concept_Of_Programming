package Assignment2;

import java.util.Scanner;

class PerfectNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num=sc.nextInt();
		
		int sum=0;
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==num)
		{
			System.out.println("It is Perfect Number");
		}
		else
		{
			System.out.println("It is not a Perfect Number");
		}
		sc.close();
	}

}
