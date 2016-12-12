package types;

import expressions.PrimaryExpressionInterface;
import semantic.EnumTag;

public class NameType extends Type implements PrimaryExpressionInterface{
	
	private String id;
	
	public NameType(String s) {
		super(null, null, null, EnumTag.NAMETYPE);
		id = s;
	}
	
	public String getValue(){
		return id;
	}
	
	public String toString() {
		return new String ("NameType : " + id);
	}
	
}
