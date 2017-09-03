import java.util.*;

class Student
{
	int roll_no;
	String name, branch;
	
	void accept_detail(int rno, String n, String b)
	{
		roll_no = rno;
		name = n;
		branch = b;
	}
	
}

class Performance extends Student
{
	
	float avg;
	float sum=0;
	float calc_avg()
	{
		Scanner sc = new Scanner(System.in);
		int[] marks = new int[5];
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter marks for subject "+(i+1)+" :");
			marks[i]=sc.nextInt();
			sum = sum + marks[i];
		}
		avg = sum / 5;
		return sum;
	}
	void Display()
	{
		System.out.println("\n");
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+roll_no);
		System.out.println("Branch: "+branch);
		System.out.println("Total marks: "+sum);
		System.out.println("Avearge marks: "+avg);
	}
}

class StudentDetails
{
	public static void main(String args[])
	{
		Performance obj = new Performance();
		Scanner sc = new Scanner(System.in);
		int rno1=0; String name1=null, branch1=null;
		System.out.println("Enter your roll number: ");
		rno1 = sc.nextInt();
		System.out.println("Enter your name: ");
		name1 = sc.next();
		System.out.println("Enter your branch: ");
		branch1 = sc.next();
		obj.accept_detail(rno1, name1, branch1);
		obj.calc_avg();
		obj.Display();
	}	
}
