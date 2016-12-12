package instructions;

import expressions.Expression;
import semantic.*;


public class Instruction extends AbstractTree {
	
	AbstractTree left;
	AbstractTree right;	
	
	
	public Instruction(AbstractTree left, AbstractTree right, EnumTag tag) {
		super(tag,left, right);			
	}
	
	public Instruction(Expression expr) {
		super(expr);
	}
	
	public Instruction() {
		super();
	}
	
	public String toString() {
		return "Instruction : " + super.toString();
	}
	
}
