package intermediary;

public enum EnumOp { 

	PLUS ("PLUS"),
	MINUS ("MINUS"),
	MINUS_U ("MINUS_U"),
	MUL("MUL"),
	DIV ("DIV"),
	AND ("AND"),
	OR ("OR"),
	LSHIFT ("LSHIFT"),
	RSHIFT ("RSHIFT"),
	ARSHIFT ("ARSHIFT"),
	XOR ("XOR");

	private final String tag;

	EnumOp( String s)
	{
		tag = s;
	}

	public String toString()
	{
		return tag;
	}

}
