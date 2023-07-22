package Assignment3;

import java.util.Scanner;

class CompoundInterest {

	
	public static double compoundInterest( double P,double R, double T,double n)
	{
		

		double compoundvalue=(double)(P*(Math.pow((1 + (R/(100*n))),T*n)) -P);
		return compoundvalue;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Principal: ");
		double principal=sc.nextDouble();
		System.out.println("Enter the Rate: ");
		double rate=sc.nextDouble();
		System.out.println("Enter the Time: ");
		double time=sc.nextDouble();
		System.out.println("Enter the number of calculations: ");
		double n=sc.nextDouble();
		
		System.out.println("the compound interest is"+compoundInterest(principal,rate,time,n)); 
		sc.close();
	}
	

}
