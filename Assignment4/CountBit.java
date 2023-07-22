package Assignment4;

import java.util.Scanner;

class CountBit {

	public static int countOneBits(int num)
	{
		int sum=0;
		int count=0;
		while(num!= 0)
		{
			sum=sum*10+ num%2;
			num=num/2;	
		}
		while(sum!=0)
		{
			count++;
			sum=sum/10;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Number : ");
		int input=sc.nextInt();
		
		System.out.println("Count of number: "+countOneBits(input));
		sc.close();
	}

}
