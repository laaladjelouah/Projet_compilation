package semantic;

import types.*;

public class Table {
	
	private Environment current;
		
	public Table() {
		current = new Environment();
	}
	
	public boolean getCurrent() {
		return (current != null);
	}
	
	public void push() {
		if (current == null) {
			current = new Environment();
		}
		else {
			Environment tmp = new Environment(current);
			current.setNext(tmp);
			current = tmp;
		}		
	}
	
	public void pop() {
		if (current == null) {
			System.err.println("Stack environment is empty !");
		}
		else {
			Environment tmp = current.getPrev();
			if (tmp != null)
				current.getPrev().setNext(null);
			current = current.getPrev();
		}
	}
	
	public void add(String s, Type t) {
		if (current != null) 
			current.add(s, t);	
		else
			System.err.println("No current environment ! i");
	}
	
	public Type get(String s) {
		Environment tmp = current;
		while (tmp != null) {
			Type t = tmp.getVariable(s);
			if (t != null)
				return t;
			tmp = tmp.getPrev();
		}
		return null;	
	}
}
