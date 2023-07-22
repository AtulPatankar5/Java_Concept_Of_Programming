package Assignment5;

import java.util.Scanner;

class SetDate {

	public static int setMonthDate(int date,int month)
	{
		int maskDate=31;
		int maskMonth=15;
		
		date=date & maskDate;
		month=month & maskMonth;
		month=month<<5;
		date=date|month;
		
		return date;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Date:");
		int date=sc.nextInt();
		System.out.print("Enter Month:");
		int month=sc.nextInt();
		
		System.out.println("New Date="+setMonthDate(date,month));
	
		sc.close();
	}

}
