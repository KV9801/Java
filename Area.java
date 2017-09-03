import java.util.*;

abstract class shape
{
	abstract float area();
	abstract float perimeter();
}

class Rectangle extends shape
{
	float l, b, ans1, ans2;
	Scanner sc = new Scanner(System.in);
	float area()
	{
		System.out.println("Enter length: ");
		l = sc.nextFloat();
		System.out.println("Enter breadth: ");
		b = sc.nextFloat();
		ans1 = l*b;
		return ans1;
	}
	float perimeter()
	{
		return ans2 = 2*(l+b);
	}
}

class Sqaure extends shape
{
	float len, a1, a2;
	Scanner sc = new Scanner(System.in);
	float area()
	{
		System.out.println("Enter length: ");
		len = sc.nextFloat();
		a1 = len*len;
		return a1;
	}
	float perimeter()
	{
		return a2 = 4*len;
	}
}

class Area
{
	public static void main(String args[])
	{
		int ch;
		Scanner sc = new Scanner(System.in);
		shape obj1 = new Rectangle();
		shape obj2 = new Sqaure();
		System.out.println("Choose the shape:\n1. Rectangle\n2. Square");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Area: "+obj1.area());
			System.out.println("Perimeter: "+obj1.perimeter());			
			break;
			
			case 2:
			System.out.println("Area: "+obj2.area());
			System.out.println("Perimeter: "+obj2.perimeter());						
			break;
			
			default:
			System.out.println("Choose the correct option!");
		}				
	}
}	
