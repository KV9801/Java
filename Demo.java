import java.util.*;
class Checks
{
	boolean checkBaggage(Traveler t)
	{
		if(t.baggageAmount>=0 && t.baggageAmount<=40)
			return true;
		else
			return false;
	}
	boolean checkImmigration(Traveler t)
	{
		if(t.expiryYear>=2001 && t.expiryYear<=2005)
			return true;
		else
			return false;
	}
	boolean checkSecurity(Traveler t)
	{
		if(t.nocStatus == true)
			return true;
		else
			return false;
	}
}

class Traveler
{
	int travelerId, baggageAmount, expiryYear;
	boolean nocStatus;
	void setTravelerId(int tId)
	{
		travelerId = tId;
	}
	void setBaggageAmount(int ba)
	{
		baggageAmount = ba;
	}
	void setExpiryYear(int ey)
	{
		expiryYear = ey;
	}
	void setNocStatus(boolean ns)
	{
		nocStatus = ns;
	}
	int getTravelerId()
	{
		return travelerId;
	}
	int getBaggageAmount()
	{
		return baggageAmount;
	}
	int getExpiryYear()
	{
	        return expiryYear;
	}
	boolean getNocStatus()
	{
		return nocStatus;
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Traveler obj = new Traveler();
		obj.setTravelerId(1001);
		obj.setBaggageAmount(35);
		obj.setExpiryYear(2019);
		obj.setNocStatus(true);
		Checks c = new Checks();
		boolean c1 = c.checkBaggage(obj);
		boolean c2 = c.checkImmigration(obj);
		boolean c3 = c.checkSecurity(obj);
		if(c1==true && c2==true && c3==true)
			System.out.println("Allow traveler to fly");
		else
			System.out.println("Detain traveler for re-checking");
	}
}
