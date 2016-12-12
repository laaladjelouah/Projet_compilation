package stree;

import intermediary.CONST;
import intermediary.InternTree;
import types.EnumType;
import types.Type;

public class StreeINT extends Stree {

	private Integer integer;

	public StreeINT(Integer integer) {
		super(null, null);
		this.type=new Type(EnumType.INTEGER);
		this.integer = integer;
	}

	public void toDot(StringBuffer str) {
		str.append("a_"+id+" [");
		str.append("shape=\"ellipse\", label=\""+this.getClass().getSimpleName()+"\\n"+integer.toString()+"\\n"+this.type.toString()+"\"];\n");
	}

	public void typeCheck(){
	}

	@Override
	public InternTree buildInternTree() {	
		return new CONST(integer);		
	}
}
