package temp;

public class Temp  {
	private static int count;
	private int num;
	private String name;
	
	public String toString()
	{
		return "t" + num;
	}

	public Temp(String name) 
	{ 
		this.name = name;
		num=count++;
	}
	
	public String getName() {
		return name;
	}

}
