package intermediary;


public class BINOP extends Exp {
	
	private EnumOp op;
	
	public BINOP(EnumOp b,InternTree left, InternTree right) 
	{
		super(left,right);
		this.op =b;
	}

	public String toString()
	{	
		String res = "";
		res += "BINOP";
		res += "(";
		res += op+", ";		
		res += this.left.toString()+", "+this.right.toString();		
		res += ")";	
		return res;
	}
}






