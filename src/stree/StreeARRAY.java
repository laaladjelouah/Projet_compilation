package stree;

import intermediary.InternTree;
import types.Type;

public class StreeARRAY extends Stree {

	private int size;	
	private int index;

	public StreeARRAY(Type t, Integer index) {
		super(null, null);
		this.size = t.getInteger();
		this.index = index.intValue();
		this.type = t.getLeft();		
	}

	public void typeCheck(){

	}

	@Override
	public InternTree buildInternTree() {
		return null;		
	}
}