package types;

public enum EnumType {
	INTEGER ("integer"), 
	CHARACTER ("character"), 
	FLOAT ("float"),
	BOOLEAN ("boolean"),
	STRING ("string"), 
	VARIABLE("variable"),
	ARRAY ("array"), 
	LIST ("list"),
	POINTER ("pointer"),
	FUNCTION("function"),
	TIMES("times"),
	NAME("name"),
	VOID("void");
	
    private final String tag;

    EnumType(String s){
            tag = s;        
    }

    public String toString(){
            return tag;
    }

}
