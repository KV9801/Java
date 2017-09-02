import java.util.*;

class customer
{
	int cid;
	long[] telno = new long[2];
	String cname;
	customer()
	{
		cid = 0;
		telno[0] = 0;
		cname = "";
	}
	customer(int c_id, long[] tel_no, String c_name)
	{
		cid = c_id;
		telno=tel_no;
		cname = c_name;
	}
	void setCustomerId(int c_id)
	{
		cid=c_id;
	}
	
	int getCustomerId()
	{
		return cid;
	}
	
	void setCustomerName(String c_name)
	{
		cname=c_name;
	}
	
	String getCustomerName()
	{
		return cname;
	}
	void setTelephoneNo(long[] tel_no)
	{
		
			telno = tel_no;
	}
	long[] getTelephoneNo()
	{
		return telno;
	}
	public static void main(String args[])
	{
		int customerId1;
		long telephoneNo1[]=new long[2];
		String customerName1;
		customer c = new customer();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		customerName1 = sc.nextLine();
		System.out.println("Enter customer ID: ");
		customerId1 = sc.nextInt();
		for(int i=0;i<2;i++)
		{
			System.out.print("Enter telephone number "+(i+1)+" :");
			telephoneNo1[i]=sc.nextLong();
		}
		c.setCustomerName(customerName1);
		c.setCustomerId(customerId1);
		c.setTelephoneNo(telephoneNo1);
		System.out.println("NAME               : "+c.getCustomerName());
		System.out.println("CUSTOMER ID        : "+c.getCustomerId());
		
		long tNo1[]=c.getTelephoneNo();
		for(int i=0;i<2;i++)
		{
			System.out.print("TELEPHONE NUMBER "+(i+1)+" :"+tNo1[i]+"\n");
		}
		
	}
}


