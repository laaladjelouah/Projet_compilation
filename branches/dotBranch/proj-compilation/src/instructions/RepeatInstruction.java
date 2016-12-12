package instructions;

import expressions.Expression;

public class RepeatInstruction extends Instruction {
	
	public RepeatInstruction(Instruction i, Expression e) {
		super(e,i, null);
	}
	
	public String toString() {
		return "Repeat : " + super.toString();
	}
	
}
