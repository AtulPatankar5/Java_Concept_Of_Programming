package Assignment2;

import java.util.Scanner;

class ArmstrongNumber {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
	
		int count=0;
		int temp1=num;
		while(temp1!=0)
		{
			temp1=temp1/10;
			++count;
		}
		
		int temp2=num;
		int sum=0;
		while(temp2!=0)
		{	
			int prod=1;
			int ans=temp2%10;
			for(int i=1;i<=count; i++)
			{
				prod=prod*ans;
			}
			sum=sum+prod;
			temp2=temp2/10;
		}
		if(sum==num)
		{
			System.out.println("ArmStrong number");
		}
		else
		{
			System.out.println("Not a ArmStrong number");
		}
		sc.close();
	}

}
