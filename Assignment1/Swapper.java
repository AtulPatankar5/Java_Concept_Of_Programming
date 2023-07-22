package Assignment1;
import  java.util.Scanner;

class Swapper
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter num1:");
		int num1=sc.nextInt();

		System.out.println("Enter num1:");
		int num2=sc.nextInt();

		System.out.println("Old num1:"+num1);
		System.out.println("Old num2:"+num2);


		int temp=num1;
		num1=num2;
		num2=temp;

		System.out.println("Swapped num1:"+num1);
	
		System.out.println("Swapped num2:"+num2);
	
		sc.close();
	}
}

