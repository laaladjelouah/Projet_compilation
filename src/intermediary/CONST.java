package intermediary;

public class CONST extends Exp {
	private int value;

	public CONST(int v) 
	{
		this.value = v;		
	}
	
	public String toString()
	{
		return new String("CONST ("+value+")");
	}
}
