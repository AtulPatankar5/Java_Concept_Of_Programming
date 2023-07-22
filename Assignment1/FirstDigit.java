package Assignment1;

import java.util.Scanner;

class FirstDigit {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();

		while(num!=0)
		{
			if(num<10 )
			{
				break;
			}
			num=num/10;
		}
		System.out.println("The First digit is :"+ num);
		
		sc.close();
	}
	

}
