package stree;

import intermediary.InternTree;
import types.*;

public class StreeBOOLEAN extends Stree {

	private Boolean b;

	public StreeBOOLEAN(Boolean b) {
		super(null, null);
		this.type=new Type(EnumType.BOOLEAN);
		this.b = b;
	}

	public void toDot(StringBuffer str) {
		str.append("a_"+id+" [");
		str.append("shape=\"ellipse\", label=\""+this.getClass().getName()+"\\n"+b.toString()+"\"];\n");
	}

	public void typeCheck(){
	}

	@Override
	public InternTree buildInternTree() {
		return null;		
	}
}
