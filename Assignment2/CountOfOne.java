package Assignment2;

import java.util.Scanner;

class CountOfOne {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number :");
		int num=sc.nextInt();		
		int output=num;
		int count=0;
		while(num!=0)
		{
			int temp=num%10;
			if(temp==1)
			{
			 ++count;
			}
			num=num/10;
		}
		System.out.println("Count of 1 digit in "+ output +" is ="+ count);
		sc.close();
	}

}
