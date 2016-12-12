package instructions;
import expressions.*;


public class WhileInstruction extends Instruction {

	
	public WhileInstruction(Expression expr, Instruction instr) {
		super(expr, instr, null);
		
	}
	
	public String toString(){
		return "While : " + super.toString();
	}

}
