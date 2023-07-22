package Assignment3;

import java.util.Scanner;

class PowerOfNumber {
	
	public static int power(int num1,int num2)
	{
		int prod=1;
		for (int i=1;i<=num2;i++)
		{
			prod=num1*prod;
		}
		return prod;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Number 1st :");
		 int num1=sc.nextInt();
		 System.out.println("Enter the Number 2nd :");
		 int num2=sc.nextInt();
		 
		 System.out.printf("the power of %d raised to %d is %d ",num1,num2,power(num1,num2));
		 sc.close();
		 
	}

}
