package Assignment4;

import java.util.Scanner;

class GetValueBit {

	public static int getValueofBit(byte num, int bitPosition)
	{
		int bit=(int) Math.pow(2, bitPosition);
		int res=num&bit;
		int ans=res>>bitPosition;
		return ans;				
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter num:");
	byte num=sc.nextByte();
	System.out.print("Enter bitposition:");
	int bitPosition=sc.nextInt();
	
	System.out.println("Bit value is :"+getValueofBit(num,bitPosition));

	sc.close();
	}

}
