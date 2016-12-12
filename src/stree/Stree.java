package stree;

import intermediary.InternTree;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import types.*;


public abstract class Stree {

	protected Stree left;
	protected Stree right;
	protected Type type;
	protected int id;   // used in toDot
	protected static int uniqId=0;


	public Stree(Stree left, Stree right) {
		this.left=left;
		this.right=right;
		this.id=uniqId++;
		type=null;
	}

	public Type getType(){
		return this.type;
	}

	public void typeCheck(){
		this.left.typeCheck();
		this.right.typeCheck();		
		if (!this.left.type.unify(this.right.type))
			System.out.println("unification error");
		else
			System.out.println("unification OK");
	}

	public String toString() {
		String result = new String();
		if ((left != null) || (right != null)){
			result +="(";
			if (left != null)
				result += left.toString();
			if (right != null){
				result+=",";
				result += right.toString();
			}
			result+=")";
		}
		return result;
	}

	public void toDot(StringBuffer str) {
		str.append("a_"+id+" [");
		str.append("shape=\"ellipse\", label=\""+this.getClass().getSimpleName()+"\\n"+((this.getType()==null)?"":this.getType().toString())+"\"];\n");
		if (left != null){
			left.toDot(str);
			str.append("a_"+id+" -> a_"+left.id+"[color=\"red\"];\n");
		}
		if (right != null){
			right.toDot(str);
			str.append("a_"+id+" -> a_"+right.id+"[color=\"blue\"];\n");
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

	public abstract InternTree buildInternTree();
}
