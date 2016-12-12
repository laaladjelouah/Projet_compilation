package types;
/* tree implementing a type*/

import semantic.AbstractTree;
import semantic.EnumTag;

public class Type extends AbstractTree{

	//private String res = "";
	//private Type left;
	//private Type right;
	private Integer integer; // array size
	
	public Type() {
		left = right = null;
		integer = 0;
	}
	
	public Type(Type left, Type right, Integer i, EnumTag tag) {
		super(tag, left,right);
		//this.left=left;
		//this.right=right;
		this.integer=i;
		//this.tag = tag;
	}

	public Type(Type left, Type right, EnumTag tag) {
		this(left,right,0, tag);
	}

	public Type(Type left) {
		this.left = left;
		this.right = null;
		this.integer = 0;
	}

	/*public Type getLeft() {
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

	public String toString() {   
		if (this.left != null || this.right != null)
		{
			if (this.left != null)            
				res += this.left.toString();
			if (this.right != null)            
				res += this.right.toString();
		}        

		return res;
	}
	*/
	public boolean isDiff(Type other) {
		String st1;
		String st2 = "";
		st1 = this.getClass().getName().substring(6);
		if(other!= null)
			st2 = other.getClass().getName().substring(6);
		if (!st1.equals(st2)) {
			return false;
		}
		else {
			if (st1.equals("BooleanType") || st1.equals("CharType") || st1.equals("FloatType")
					|| st1.equals("IntType") || st1.equals("StringType") || st1.equals("NameType")) 
			{
				return true;
			}
			if (st1.equals("FuncType") || st1.equals("ProdType")) {
				return (this.left.isDiff(other.getLeft()) && this.right.isDiff(other.getRight()));
			}
			if (st1.equals("PointerType") || st1.equals("ListType")) {
				return this.left.isDiff(other.getLeft());
			}
		}
		return true;
	}
	
	public boolean isSameBasicType(Type t, Type other) {
		return ((t instanceof BooleanType && other instanceof BooleanType)
				|| (t instanceof IntType && other instanceof IntType)
				|| (t instanceof FloatType && other instanceof FloatType)
				|| (t instanceof CharType && other instanceof CharType)
				|| (t instanceof StringType && other instanceof StringType)
				|| (t instanceof NameType && other instanceof NameType)
				);
	}
	
	public TypeDiff diff(Type other) {
		if (this.isDiff(other))
				return null;
		else {
			if (!isSameBasicType(this,other)) {
				return new TypeDiff(this,other);
			}
			else if (this instanceof FuncType) {
				if (other instanceof FuncType) {
					TypeDiff l = left.diff(other.left);
					if (l != null)
						return l;
					TypeDiff r = right.diff(other.right);
					if (r != null)
						return r;
				}
			}
			else if (this instanceof ProdType) {
				if (other instanceof ProdType) {
					TypeDiff l = left.diff(other.left);
					if (l != null)
						return l;
					TypeDiff r = right.diff(other.right);
					if (r != null)
						return r;
				}
			}
			else if (this instanceof ListType) {
				if (other instanceof ListType)
					return this.left.diff(other.left);
			}
			else if (this instanceof PointerType) {
				if (other instanceof PointerType)
					return this.left.diff(other.left);
			}
		}
		return null;
	}
	
	
	/*public boolean unify (Type unif)
	{
		TypeDiff tdif = diff(unif);
		if (tdif == null)
			return true;
		if (tdif.getVar().getClass().getName() != "variable")
			return false;
		
		return true;
		
	}*/
}
