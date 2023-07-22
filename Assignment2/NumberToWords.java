package Assignment2;

import java.util.Scanner;

class NumberToWords {

	public static void main(String[] args) 
	{
		
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number :");
		int num=sc.nextInt();
	
		int temp=0;
		while(num!=0)
		{
			temp=temp*10+num%10;
			num=num/10;   
		}
		
		while(temp!=0)
		{
			int output=temp%10;
		
			switch(output)
			{
			case 1: System.out.print ("One "); break;
			case 2: System.out.print ("Two " ); break;
			case 3: System.out.print ("Three "); break;
			case 4: System.out.print ("Four "); break;
			case 5: System.out.print ("Five "); break;
			case 6: System.out.print ("Six "); break;
			case 7: System.out.print ("Seven "); break;
			case 8: System.out.print ("Eight "); break;
			case 9: System.out.print ("Nine " ); break;
			case 0: System.out.print ("Zero "); break;
			default : System.out.print ("Invalid input"); break;
			}
			temp=temp/10;
		}
		sc.close();

	}

}
