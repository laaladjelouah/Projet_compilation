package stree;

public enum EnumTag { 

	IF ("if"), 
	THENELSE ("thenelse"), 
	WHILE ("while"), 
	AFF ("="), 
	AND ("&&"), 
	OR ("||"), 
	LT ("<"), 
	GT (">"), 
	LE ("<="), 
	GE (">="), 
	EQ ("=="), 
	DIFF ("!=") , 
	PLUS ("+"), 
	MINUS ("-"), 
	MINUS_U ("-"), 
	MULT ("*"), 
	DIV ("/"), 
	VAR ("variable"),
	INTEGER ("integer"), 
	REAL ("real"), 
	STRING("string"),
	SUCC("succ");	

	private final String tag;

	EnumTag(String s){
		tag = s;
	}

	public String toString(){
		return tag;
	}
}

