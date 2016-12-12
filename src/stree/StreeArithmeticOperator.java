package stree;

import types.EnumType;
import types.Type;

// Abstract Syntax Tree
public abstract class StreeArithmeticOperator extends Stree {

	public StreeArithmeticOperator(Stree left, Stree right) {
		super(left, right);
		typeCheck();
	}

	public void typeCheck(){
		this.left.typeCheck();
		this.right.typeCheck();		
		if (left.type.isFloat() || right.type.isFloat()) {
			this.type = new Type(EnumType.FLOAT);
		}	
		else
			this.type=this.left.getType();
	}    
}
