package instructions;

import semantic.EnumTag;
import expressions.Expression;

public class AssignmentInstruction extends Instruction {

	public AssignmentInstruction(Expression e) {
		super(e);
	}
	
	public AssignmentInstruction(Expression e1, Expression e2) {
		super(e1,e2, EnumTag.AFF);
	}
		
	public String toString() {
		return "Assignment : " + super.toString();
	}
}
