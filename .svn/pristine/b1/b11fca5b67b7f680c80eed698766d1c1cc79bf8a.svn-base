package types;

/* tree implementing a type*/

public class Type {

	private EnumType label;	
	private Type left;
	private Type right;
	private Integer integer;
	private String identifier;

	public Type(EnumType label, Type left, Type right, String identifier) {
		this.label=label;
		this.left=left;
		this.right=right;
		this.identifier=identifier;
		this.integer=0;
	}
	
	public int getInteger() {
		return integer.intValue();
	}

	public Type(String name) {
		this(null,name);
	}

	public Type(EnumType label, Type left, Type right) {
		this(label,left,right,null);
	}

	public Type(EnumType label, Type left, Integer i) {
		this(label,left,null,null);
		this.integer=i;
	}

	public Type(EnumType label, String identifier) {
		this(label,null,null,null);
		this.identifier=identifier;
	}

	public Type(EnumType label, Type left) {
		this(label,left,null,null);
		this.integer=0;
	}

	public Type(EnumType label) {
		this(label,null,null,null);
		this.integer=0;
	}

	public EnumType getLabel(){
		return label;
	}

	public Type getLeft(){
		return left;
	}

	public Type getRight(){
		return right;
	}

	public String toString(){
		if ((left==null) && (right==null))
			return new String(label.toString());
		else if ((left==null) || (right==null))
			return new String(label.toString()+"("+((left==null)?"":left.toString())+((right==null)?"":right.toString())+")");
		else
			return new String(label.toString()+"("+((left==null)?"null":left.toString())+","+((right==null)?"null":right.toString())+")");
	}

	// Robinson algorithm
	// EFFECT on this and with !!!
	public boolean unify(Type with){
		TypeDiff theta=null;
		do {
			theta=diff(with);
			this.substitue(theta);
			with.substitue(theta);
		} while (!theta.isEmpty() && !theta.isBottom());
		if (theta.isBottom()) 
			return false;
		if (theta.isEmpty())
			return true;		
		return false;
	}

	public boolean isFloat() {
		return label == EnumType.FLOAT;
	}
	
	// Replace left by right
	public void substitue(TypeDiff diff){
		if (diff.isEmpty() || diff.isBottom())
			return;
		switch (label) {
		case CHARACTER:
		case INTEGER:
		case FLOAT:
		case STRING:
		case BOOLEAN:
			break;
		case ARRAY:
		case POINTER:
		case LIST:
			left.substitue(diff);
			break;
		case FUNCTION: 
		case TIMES:
			left.substitue(diff);
			right.substitue(diff);
			break;
		case VARIABLE:
			if ((diff.getLeft().identifier==this.identifier)){
				this.left=diff.getRight().left;
				this.right=diff.getRight().right;
				this.label=diff.getRight().label;
				if (diff.getRight().label==EnumType.VARIABLE)
					this.identifier=diff.getRight().identifier;
			}
			break;
		}
	}

	// Difference
	public TypeDiff diff(Type with){
		switch (label) {
		case CHARACTER:
		case INTEGER:
		case FLOAT:
		case STRING:
		case BOOLEAN:
			if (with.label==label)
				return new TypeDiffEmpty();
			else if (with.label==EnumType.VARIABLE)
				return new TypeDiff(with, this);
			else if (with.label == EnumType.FUNCTION) 
				return this.diff(with.getRight());
			else
				return new TypeDiffBottom();
		case ARRAY:
		case POINTER:
		case LIST:
			if (with.label == label){
				TypeDiff l=left.diff(with.left);
				return l;
			}
			else if (with.label==EnumType.VARIABLE)
				return new TypeDiff(with, this);
			else if (with.label == left.label)
				return new TypeDiff(with,left);
			else
				return new TypeDiffBottom();
		case FUNCTION:
		case TIMES:
			if (with.label == label){
				TypeDiff l=left.diff(with.left);
				if (!l.isEmpty())
					return l;
				TypeDiff r=right.diff(with.right);
				return r;
			}
			else if (with.label==EnumType.VARIABLE)
				return new TypeDiff(with, this);
			else
				return new TypeDiffBottom();
		case VARIABLE: 
			return new TypeDiff(this, with);
		case NAME: 
			if ((with.label == this.label) && (with.identifier.equals(this.identifier)))
				return new TypeDiffEmpty();
			else
				return new TypeDiffBottom();
		}
		return null;
	}

}
