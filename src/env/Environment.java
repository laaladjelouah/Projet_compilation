package env;

import java.util.HashMap;
import types.Type;

public class Environment {

	private HashMap<String, Type> values;
	private static int cpt = 0;
	private int id; 
	private Environment next;
	private Environment prev;

	public Environment() {
		this(null);
	}

	public Environment(Environment p, Environment n) {
		values = new HashMap<>();
		id = cpt++;
		prev = p;
		next = n;
	}

	public Environment(Environment p) {
		this(p, null);
	}

	public int getID() {
		return id;
	}

	public Environment getPrev() {
		return prev;
	}

	public Environment getNext() {
		return next;
	}

	public void setNext(Environment n) {
		next = n;
	}

	public void setPrev(Environment p) {
		prev = p;
	}

	public void add(String s, Type t) {
		values.put(s, t);
	}

	public Type getVariable(String s) {
		return values.get(s);
	}

}
