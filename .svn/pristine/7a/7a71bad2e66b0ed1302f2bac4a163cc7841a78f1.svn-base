package intermediary;

public enum EnumRel{ 
	LT ("LT"), 
	GT ("GT"), 
	LE ("LE"), 
	GE ("GE"), 
	EQ ("EQ"), 
	NE("NE") , 
	ULT ("ULT"), 
	UGT ("UGT"), 
	ULE ("ULE"), 
	UGE ("UGT");

	private final String tag;

	EnumRel( String s)
	{
		tag = s;
	}

	public String toString()
	{
		return tag;
	}

	public EnumRel not()
	{
		switch (this)
		{
			case EQ:  return NE;
			case NE:  return EQ;
			case LT:  return GE;
			case GE:  return LT;
			case GT:  return LE;
			case LE:  return GT;
			case ULT: return UGE;
			case UGE: return ULT;
			case UGT: return ULE;
			case ULE: return UGT;
			default: throw new Error("bad relop in CJUMP.notRel");
		}
	}
}
