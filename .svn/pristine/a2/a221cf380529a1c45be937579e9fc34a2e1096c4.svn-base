package stree;

import types.*;

// Abstract Syntax Tree
public abstract class StreeBooleanOperator extends Stree {

	public StreeBooleanOperator(Stree left, Stree right) {
		super(left, right);
		typeCheck();
	}

	public void typeCheck(){
		this.left.typeCheck();
		this.right.typeCheck();
		if (!this.left.type.unify(this.right.type))
			System.out.println("unification error");
		else
			System.out.println("unification OK");
		type=new Type(EnumType.BOOLEAN);
	}
}
