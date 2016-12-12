package semantic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import types.FuncType;
import types.TypeDiff;
import expressions.CharExpression;
import expressions.FloatExpression;
import expressions.IDExpression;
import expressions.IntegerExpression;
import expressions.PrimaryExpressionInterface;
import expressions.StringExpression;


public class AbstractTree {

	protected EnumTag tag;	// node label
	protected AbstractTree left;
	protected AbstractTree right;
	protected String res = "";
	protected int id;   // used in toDot
	protected static int uniqId=0;

	public AbstractTree(EnumTag tag,AbstractTree left, AbstractTree right) {
		this.left = left;
		this.right = right;
		this.tag=tag;
		this.id=uniqId++;
	}

	public AbstractTree() {
		this.left = null;
		this.right = null;
		this.id=uniqId++;
	}

	public AbstractTree(AbstractTree node) {
		this.left = node;
		this.right = null;
		this.id=uniqId++;
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

	public AbstractTree getRight() {
		return right;
	}

	public void setRight(AbstractTree right) {
		this.right = right;
	}

	public AbstractTree getLeft() {
		return left;
	}

	public void setLeft(AbstractTree left) {
		this.left = left;
	}

	public void toDot(StringBuffer str) {
		if(tag != null ){
			str.append("a_"+id+" [");

			str.append("shape=\"ellipse\", label=\""+tag.toString()); 
			//str.append("shape=\"ellipse\", , label=\"monlabel");
			//if (this!=null)
			//str.append("\\nobject: "+this.toString()); 
			if(this instanceof FuncType){
				FuncType tmp = (FuncType) this;
				String func_name = tmp.getFuncName();
				str.append(" : " + func_name);
			}
			if(this instanceof IDExpression){
				IDExpression tmp = (IDExpression) this;
				String name_id = tmp.getNameVar();
				str.append("\\nname: "+name_id); 
			}
			if(this instanceof PrimaryExpressionInterface){
				PrimaryExpressionInterface tmp = (PrimaryExpressionInterface) this;
				String name_id = tmp.getValue();
				str.append("\\nvalue: "+name_id); 
			}
			str.append("\"];\n");
			if (left != null && left.tag != null){
				left.toDot(str);
				str.append("a_"+id+" -> a_"+left.id+";\n");
			}
			if (right != null && right.tag != null){
				right.toDot(str);
				str.append("a_"+id+" -> a_"+right.id+";\n");
			}
		}
	}

	public void toDot(String file) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write("digraph Stree {\n");
			StringBuffer str = new StringBuffer();
			toDot(str);
			out.write(str.toString());
			out.write("}\n");
			out.close();
		} catch (IOException e) {
			System.err.println("ERROR: build dot");
		}		
	}

	public TypeDiff diff(AbstractTree left2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isDiff(AbstractTree left2) {
		// TODO Auto-generated method stub
		return false;
	}
}
