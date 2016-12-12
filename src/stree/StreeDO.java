package stree;

import intermediary.InternTree;

public class StreeDO extends Stree {

	public StreeDO(Stree left, Stree right) {
		super(left, right);
	}

	public void typeCheck(){
		left.typeCheck();
		right.typeCheck();
	}

	@Override
	public InternTree buildInternTree() {
		return null;		
	}
}
