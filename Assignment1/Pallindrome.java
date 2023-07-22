package Assignment1;

import java.util.Scanner;

class Pallindrome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		
		int tempnum=num;
		int temp=0;
		while(num!=0) 
		{
			temp=temp*10 + num%10;
			num=num/10;
		}
		if(tempnum==temp)
		{
			System.out.println("It's a Pallindrome");
		}
		else
		{
			System.out.println("It's not a Pallindrome");
		}
		sc.close();
		
	}

}
