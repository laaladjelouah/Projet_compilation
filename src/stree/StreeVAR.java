package stree;


import intermediary.InternTree;
import intermediary.TEMP;
import temp.Temp;
import types.EnumType;
import types.Type;

public class StreeVAR extends Stree {

	private String var;
	private int size;
	private int index;
	
	public StreeVAR(String var, Type type) {
		super(null, null);
		this.var=var;
		this.type = type;
	}
	
	
	public StreeVAR(String var, Type type, Integer index) {
		super(null, null);
		this.var=var;
		this.type = type;
		this.index = index.intValue();
		if (type.getLabel() == EnumType.ARRAY) {
			this.size = type.getInteger();
		}
	}

	public void typeCheck(){
		if (type.getLabel() == EnumType.ARRAY) {
			if (index >= size) {
				System.err.println("Index " + index + " is out of range ! Array " + var + " is size : " + size);
			}
		}
	}

	public void toDot(StringBuffer str) {
		str.append("a_"+id+" [");
		str.append("shape=\"ellipse\", label=\""+this.getClass().getSimpleName()+"\\n"+var+"\\n"+type.toString()+"\"];\n");
	}

	public String toString(){
		return new String("VAR"+"("+var+"):"+type.toString());
	}
	
	@Override
	public InternTree buildInternTree() {
		return new TEMP(new Temp(var));
	}
}
