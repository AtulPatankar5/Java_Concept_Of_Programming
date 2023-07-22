package Assignment1;
import java.util.Scanner;


class ProductOfNumber

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


		int prod=1;
		while(num!=0)
		{
			int newnum=num%10;
			prod=prod*newnum;
			num=num/10;
		}

		System.out.println( "Product of numbers is:"+ prod);
		sc.close();
	}
	
}




