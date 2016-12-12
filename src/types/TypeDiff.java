package types;

public class TypeDiff {

	private Type left;
	private Type right;

	public TypeDiff(Type left, Type right) {
		this.left = left;
		this.right = right;
	}

	boolean isEmpty(){
		return false;
	}

	boolean isBottom(){
		return false;
	}

	public String toString() {
		return new String("<"+getLeft()+", "+getRight()+">\n");
	}

	public Type getLeft() {
		return left;
	}

	public void setLeft(Type left) {
		this.left = left;
	}

	public Type getRight() {
		return right;
	}

	public void setRight(Type right) {
		this.right = right;
	}
}


