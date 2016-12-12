package expressions;

import semantic.EnumTag;

public class FloatExpression extends Expression implements PrimaryExpressionInterface{

	private Float f;
	
	public FloatExpression(Float f) {
		super(null, null, EnumTag.FLOAT);
		this.f = f;
	}
	
	public String getValue() {
		return this.f.toString();
	}
	
	public String toString() {
		return "Float : " + f.toString();  
	}



}
