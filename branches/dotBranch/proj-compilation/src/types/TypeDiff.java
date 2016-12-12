package types;

public class TypeDiff extends Type {

	private Type t1;
	private Type t2;
	
	public TypeDiff() {
		this(null, null);
	}
	
	public Type getLeft(){
		return this.t1;
	}
	
	public Type getRight(){
		return this.t2;
	}
	
	
	public TypeDiff(Type t1, Type t2) {
		this.t1 = t1;
		this.t2 = t2;
	}
	
	public String toString() {
		String result = "";
		if (t1 != null && t2 != null)
			result += "<" + t1.toString() +"," + t2.toString() + ">";
		return result;
	}
}
