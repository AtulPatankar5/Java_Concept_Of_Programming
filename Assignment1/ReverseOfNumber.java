package Assignment1;
import java.util.Scanner;


class ReverseOfNumber
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number whose number need to be reversed:");
		int num=sc.nextInt();
		

		System.out.println("Number initially:"+num);

		int temp=0;
		while(num !=0)	
		{
		
			temp = temp*10 + num%10;
			num=num/10;
		}
		
		System.out.println("Reversed number is "+ temp);
		sc.close();
	}

}




