package Assignment6;
import java.util.Scanner;
class StudentMarks
{
	int rollNo;
	int sub1Marks;
	int sub2Marks;
	int sub3Marks;
	public StudentMarks(int roll,int sub1,int sub2, int sub3)
	{
		this.rollNo=roll;
		this.sub1Marks=sub1;
		this.sub2Marks=sub2;
		this.sub3Marks=sub3;
	}
	
	boolean isStudentPass()
	{
		int sum=sub1Marks+sub2Marks+sub3Marks;
		if((sub1Marks>=40 && sub2Marks>=40 && sub3Marks>=40) && sum>=120 )
			return true;
		return false;	
	}
	boolean isStudentFail()
	{
		int sum=sub1Marks+sub2Marks+sub3Marks;
		if((sub1Marks<40   || sub2Marks<40 || sub3Marks<40) || sum<120 )
			return true;
		return false;
	}	
}
class StudentInfo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		System.out.print("Enter rollno:");
		int roll=sc.nextInt();
		System.out.print("Enter Maths marks:");
		int sub1=sc.nextInt();
		System.out.print("Enter English marks:");
		int sub2=sc.nextInt();
		System.out.print("Enter Hindi marks:");
		int sub3=sc.nextInt();
		
		StudentMarks s= new StudentMarks(roll,sub1,sub2,sub3);
		System.out.println("Student is pass="+s.isStudentPass());
		System.out.println("Student is fail="+s.isStudentFail());
		sc.close();
	}
}

