package Assignment3;

import java.util.Scanner;

class FactorialNumber {
	public static int factorial(int num)
	{
		while(num==0)
			return 1;
		return num*factorial(num -1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		
		System.out.println("Factorial of number is :" + factorial(num));
		sc.close();
	}

}
