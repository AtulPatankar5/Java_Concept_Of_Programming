package Assignment4;

import java.util.Scanner;

class SetValue {
	public static int setBitOne(byte num,int bitPos)
	{
		byte mask= (byte) Math.pow(2, (bitPos));
		int ans=num | mask;
		return ans;
	}
		
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		byte num=sc.nextByte();
		System.out.println("Enter the bitposition :");
		int bitPos=sc.nextInt();
			
		System.out.println("Set new value is="+setBitOne(num,bitPos));
		sc.close();
	}

}
