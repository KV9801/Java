import java.util.*;

class customer2
{
	static int customerid=1000;
	static int count=0;
	customer2()
	{
		count++;
	}
	static void setCustid()
	{
		customerid++;
	}
	int getCustomerid()
	{
		return customerid;
	}
	static int totalcust()
	{
		return count;
	}
	public static void main(String args[])
	{
		customer2[] obj= new customer2[5];
		for(int i=0;i<5;i++)
		{
			obj[i]=new customer2();
			setCustid();
			System.out.println("Customer "+(i+1)+" ID: "+obj[i].getCustomerid());
			System.out.println("Total customers: "+totalcust());
		}
	}
}
