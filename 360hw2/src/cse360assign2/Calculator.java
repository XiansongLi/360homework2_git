package cse360assign2;

public class Calculator 
{
	private int total;
	private String history;
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
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
		history = history + " + "+ value;
	}
	/**the subtract method subtract the parameter from the total variable*/
	public void subtract (int value) 
	{
		total -= value;
		history = history + " - "+ value;
	}
	/**the multiply method multiply the total by the parameter*/
	public void multiply (int value) 
	{
		total *= value;
		history = history + " * "+ value;
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
		history = history + " / "+ value;
	}
	/**the getHistory class will return a history of all actions as a string*/
	public String getHistory ()  
	{
		return history;   
	}
}

class test
{
	public static void main(String[] args)
	{
		
		Calculator ca=new Calculator();
		ca.add(4);
		ca.subtract(2);
		ca.multiply(2);
		ca.add(5);
		System.out.println(ca.getTotal());
		System.out.print(ca.getHistory());
	}
}