package types;
public class PointerType extends Type {
	private Type t; 
	
	public PointerType(Type t) {
		super(t);
		this.t = t;
	}
	
	public String toString() {
		return "Pointer of " + t.toString();
	}
}
