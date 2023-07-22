package Assignment1;
import java.util.Scanner;


class AreaOfRectangle
{
	public static void main(String [] args)
	{
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length:");
		int length=sc.nextInt();

		System.out.println("Enter breadth:");
		int breadth=sc.nextInt();

		int rectArea=2*(length+breadth);
		System.out.println(rectArea);
		sc.close();
	}
}





