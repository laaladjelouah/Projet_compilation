package expressions;

import semantic.EnumTag;

public class IntegerExpression extends Expression implements PrimaryExpressionInterface{
	
	private Integer i;
	
	public IntegerExpression(Integer i) {
		super(null, null, EnumTag.INTEGER);
		this.i = i;
	}

	public String getValue() {
		return i.toString();
	}
	
	public String toString() {
		return "Integer : " + i.toString();
	}
}
