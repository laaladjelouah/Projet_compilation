package types;

import semantic.EnumTag;

public class FuncType extends Type {
	
	String func_name;
	
	public FuncType(Type t1, Type t2, String name) {
		super(t1,t2, EnumTag.FUNCTION);
		this.func_name = name;
	}
	
	public String getFuncName(){
		return this.func_name;
	}
	public String toString() {
		return "Func type : " + super.toString();
	}
}
