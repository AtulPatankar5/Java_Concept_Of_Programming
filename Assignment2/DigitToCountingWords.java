package Assignment2;

import java.util.Scanner;

class DigitToCountingWords {

	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number :");
		int num=sc.nextInt();

		System.out.println(convertToWords(num));
		sc.close();
   }

	public static String convertToWords(int num) 
	{
		if (num == 0) 
		{
			return "Zero";	            
		}
		
		String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
		String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

		String result = "";

		if (num >= 1000) 
		{
			result = result + convertToWords(num / 1000) + " Thousand ";
		    num %= 1000;
		}

		if (num >= 100) 
		{
			result = result + ones[num / 100] + " Hundred ";
			num %= 100;
		}

		if (num >= 20) 
		{
			result = result + tens[num / 10] + " ";
		    num %= 10;
		}

        if (num > 0) 
        {
        	result = result + ones[num];
        }
        return result;	
	}	
}
