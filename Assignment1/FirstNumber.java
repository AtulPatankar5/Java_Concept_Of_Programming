package Assignment1;
import java.util.Scanner;


class FirstNumber
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter num1:");
		int num=sc.nextInt();
		
		int temp=0;
		while(num!=0)
		{	
			temp= temp*10 + num%10;
			num=num/10;
		}
		int firstnum= temp%10;
		System.out.println("First number: " +firstnum);

		sc.close();
	}

}




