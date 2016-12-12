package expressions;

import semantic.EnumTag;

public class StringExpression extends Expression implements PrimaryExpressionInterface{
	
	private String s;
	
	public StringExpression(String s) {
		super(null, null, EnumTag.STRING);
		this.s = s;
	}
	
	public String getValue() {
		return this.s;
	}

	public String toString() {
		return "String : " + s.toString();  
	}


}
