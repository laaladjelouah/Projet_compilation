package stree;

import intermediary.InternTree;
import types.*;

public class StreeFUNCTION extends Stree {

	private String str=null;
	private Type functType=null;
	private Type args;

	public StreeFUNCTION(String str, Type functType, Stree left) {
		super(left, null);
		this.functType = functType;
		this.str = str;
		this.args = left.type;
	}

	public Type getArgs() {
		return args;
	}

	public String toString() {
		String result = new String();
		result = str;
		result += super.toString();
		return result;
	}

	@Override
	public InternTree buildInternTree() {		
		return null;
	}

}
