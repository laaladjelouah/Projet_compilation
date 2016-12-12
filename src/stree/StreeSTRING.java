package stree;

import intermediary.InternTree;
import types.EnumType;
import types.Type;

public class StreeSTRING extends Stree {

	private String str;

	public StreeSTRING(String str) {
		super(null, null);
		this.str = str;
	}

	public void typeCheck(){
		type=new Type(EnumType.STRING);
	}
	
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
