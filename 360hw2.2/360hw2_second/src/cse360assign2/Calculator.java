package cse360assign2;

public class Calculator 
{
	private int total;

	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/** the getTotal method return the current total*/
	public int getTotal () 
	{
		return total;
	}
	/**the add method add the parameter to the total variable*/
	public void add (int value) 
	{
		total += value; 
	}
	/**the subtract method subtract the parameter from the total variable*/
	public void subtract (int value) 
	{
		total -= value;
	}
	/**the multiply method multiply the total by the parameter*/
	public void multiply (int value) 
	{
		total *= value;
	}
	/**the divide method divide the total by the parameter*/
	public void divide (int value) 
	{
		if (value == 0)
		{
			total = 0;
		}
		else
		{ 
			total /= value;  
		}
	}
	
	public String getHistory ()  
	{
		return "";   
	}

}
 