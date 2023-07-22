package Assignment5;

import java.util.Scanner;

class PrintPattern1 {

	public static void PrintPattern(int num)
	{
		for(int i=1; i<=num; i++) 
		{
			for(int j=1; j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");		
				}
				
			}
			System.out.println();
			
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);	
		System.out.print("enter number is:");
		int num=sc.nextInt();
	
		PrintPattern(num);
		
		sc.close();
}

}
