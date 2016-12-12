package stree;

import intermediary.InternTree;
import types.Type;

public class StreeSEQ extends Stree {

	private Stree left;
	private Stree right;
	
	public StreeSEQ(Stree left, Stree right) {
		super(left, right);
		this.left = left;
		this.right = right;
	}
	
	public StreeSEQ(Stree left, Stree right, Type type) {
		super(left, right);
		this.left = left;
		this.right = right;
		this.type = type;
	}

	public void typeCheck(){
		left.typeCheck();
		right.typeCheck();
	}
	
	@Override
	public InternTree buildInternTree() {
		// TODO Auto-generated method stub
		return null;
	}
}
