package expressions;

import semantic.EnumTag;

public class CharExpression extends Expression implements PrimaryExpressionInterface{
	
	private String v;
	
	public CharExpression(String v) {
		super(null, null, EnumTag.CHARACTER);
		this.v = v;
	}
	
	public String getValue(){
		return v;
	}
	
	public String toString() {
		return "Char";  
	}

}
