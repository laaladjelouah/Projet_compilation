package intermediary;

import temp.*;

public class TEMP extends Exp {
	public Temp temp;

	public TEMP(Temp t)
	{
		temp=t;
	}	

	public String toString()
	{	
		return new String("TEMP ("+temp.toString()+")");
	}	

}
