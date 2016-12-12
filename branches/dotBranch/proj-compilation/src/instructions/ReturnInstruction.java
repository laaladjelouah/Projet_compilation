package instructions;
import expressions.*;


public class ReturnInstruction extends Instruction {

	
	public ReturnInstruction(Expression expr) {
		super(expr);
		
	}
	
	public String toString(){
		return "Return : " + super.toString();
	}

}