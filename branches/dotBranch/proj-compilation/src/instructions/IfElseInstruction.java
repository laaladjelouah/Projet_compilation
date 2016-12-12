package instructions;

public class IfElseInstruction extends Instruction {
	
	public IfElseInstruction(Instruction i1, Instruction i2) {
		super(i1,i2, null);
	}
	
	public String toString() {
		return "If Else : " + super.toString();
	}
	
}
