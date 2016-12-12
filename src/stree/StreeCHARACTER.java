package stree;

import intermediary.InternTree;
import types.*;

public class StreeCHARACTER extends Stree {

	private String str;

	public StreeCHARACTER(String str) {
		super(null, null);
		this.type=new Type(EnumType.CHARACTER);
		this.str = str;
	}

	public void typeCheck(){
		type=new Type(EnumType.STRING);
	}
	
	@Override
	public InternTree buildInternTree() {
		return null;		
	}
}
