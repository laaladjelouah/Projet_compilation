package stree;

import intermediary.InternTree;

import java.util.ArrayList;

import types.*;

public class StreeFUNCCALL extends Stree {

	private ArrayList<Type> list;
	private Stree left;
	private String name;

	public StreeFUNCCALL(Stree left, ArrayList<Type> list, String name) {
		super(left,null);
		this.list = list;
		this.left = left;
		this.name = name;
		typeCheck();
	}

	public StreeFUNCCALL(String name, Type t) {
		this(null,null,name);
		this.type = t;
	}

	public String getFuncName() {
		return name;
	}

	public void typeCheck() {
		if (list != null) {
			boolean find_function = false;
			for (Type type : list) {
				if (type.getLeft().unify(left.type)) {
					find_function = true;
					this.type = type.getRight();
					return ;
				}
			}
			if (!find_function)
				System.err.println("Function doesn't match !");
		}
	}

	@Override
	public InternTree buildInternTree() {	
		return null;
	}
}
