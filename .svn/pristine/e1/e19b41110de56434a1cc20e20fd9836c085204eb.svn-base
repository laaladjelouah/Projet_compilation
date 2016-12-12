import java_cup.runtime.*;

%%
%line
%column
%cupsym LexerSymbol
%cup
%xstate MUL_COMMENT
%xstate COMMENT
%xstate STRING

%{
private Symbol symbol (int type) {
	return new Symbol (type, yyline, yycolumn);
	
}

private Symbol symbol (int type, Object value) {
   	return new Symbol (type, yyline, yycolumn, value);
}

private void echo (){
	System.out.print(yytext());
}

private void error(String message) {
    System.err.println("Error at line "+(yyline+1)+", column "+(yycolumn+1)+" : "+message);
}
%}

id = [a-zA-Z][a-zA-Z0-9_]*
nb = 0|[1-9][0-9]*
class_name = [A-Z][a-zA-Z]*
real = [0-9]*"."[0-9]*

%%
"/*"				{ yybegin(MUL_COMMENT);}
					
<MUL_COMMENT>"*/" 	{ yybegin(YYINITIAL);}	
<MUL_COMMENT>\n 	{}	
<MUL_COMMENT> .     {}

"//"			    { yybegin(COMMENT);}
					
<COMMENT>\n 		{ yybegin(YYINITIAL);}			
<COMMENT> .   		{}

"\""  				{ yybegin(STRING);}
<STRING>"\"" 		{ yybegin(YYINITIAL); return symbol(LexerSymbol.STRING_LITERAL, new String(yytext())); }
<STRING>. 			{ }

"("      			{ return symbol(LexerSymbol.LPAR, new String("'('")); }
")"      			{ return symbol(LexerSymbol.RPAR, new String("')'")); }
"{"      			{ return symbol(LexerSymbol.LACC, new String("'{'")); }
"}"    				{ return symbol(LexerSymbol.RACC, new String("'}'")); }
"["      			{ return symbol(LexerSymbol.LCRO, new String("'['")); }
"]"      			{ return symbol(LexerSymbol.RCRO, new String("']'")); }


"class" 			{ return symbol(LexerSymbol.CLASS, new String("class")); }
"integer"    		{ return symbol(LexerSymbol.INTEGER, new String("integer")); }
"float"      		{ return symbol(LexerSymbol.FLOAT, new String("float")); }
"character"  		{ return symbol(LexerSymbol.CHAR, new String("char")); }
"boolean"    		{ return symbol(LexerSymbol.BOOL, new String("bool")); }
"string"     		{ return symbol(LexerSymbol.STRING, new String("string")); }
"list"    			{ return symbol(LexerSymbol.LIST, new String("list")); }
"of"    			{ return symbol(LexerSymbol.OF, new String("of")); }
"^"          		{ return symbol(LexerSymbol.CHAPEAU, new String("'^'")); }
"structure"  		{ return symbol(LexerSymbol.STRUCT, new String("structure")); }
"true"       		{ return symbol(LexerSymbol.TRUE, new String("true")); }
"false"      		{ return symbol(LexerSymbol.FALSE, new String("false")); }
"null"       		{ return symbol(LexerSymbol.NULL, new String("null")); }
"if"         		{ return symbol(LexerSymbol.IF, new String("if")); }
"else"		 		{ return symbol(LexerSymbol.ELSE, new String("else")); }
"foreach"    		{ return symbol(LexerSymbol.FOREACH, new String("foreach")); }
"while"		 		{ return symbol(LexerSymbol.WHILE, new String("while")); }
"repeat"	 		{ return symbol(LexerSymbol.REPEAT, new String("repeat")); }
"function"   		{ return symbol(LexerSymbol.FCT, new String("function")); }
"procedure"  		{ return symbol(LexerSymbol.PROCEDURE, new String("procedure")); }
"return"	 		{ return symbol(LexerSymbol.RETURN, new String("return")); }
"in"		 		{ return symbol(LexerSymbol.IN, new String("in")); }

","					{ return symbol(LexerSymbol.COMMA, new String("','")); }
":"          		{ return symbol(LexerSymbol.COLON, new String("':'")); }
";"          		{ return symbol(LexerSymbol.SEMIC, new String("';'")); }
"+"          		{ return symbol(LexerSymbol.PLUS, new String("'+'")); }
"-"          		{ return symbol(LexerSymbol.MINUS, new String("'-'")); }
"*"          		{ return symbol(LexerSymbol.MULT, new String("'*'")); }
"/"          		{ return symbol(LexerSymbol.DIV, new String("'/'")); }
"%"          		{ return symbol(LexerSymbol.MOD, new String("'%'")); }
"!"          		{ return symbol(LexerSymbol.NOT, new String("'!'")); }


"<"          		{ return symbol(LexerSymbol.LESS, new String("'<'")); }
">"          		{ return symbol(LexerSymbol.GREAT, new String("'>'")); }
"="			 		{ return symbol(LexerSymbol.AFF, new String("'='")); }
"=="         		{ return symbol(LexerSymbol.EQUAL, new String("'=='")); }
"!="         		{ return symbol(LexerSymbol.DIFF, new String("'!='")); }
"<="         		{ return symbol(LexerSymbol.LE, new String("'<='")); }
">="         		{ return symbol(LexerSymbol.GE, new String("'>='")); }
"&&"				{ return symbol(LexerSymbol.AND_OP, new String("'&&'")); }
"||"				{ return symbol(LexerSymbol.OR_OP, new String("'||'")); }
"++"				{ return symbol(LexerSymbol.INC_OP, new String("'++'")); }
"--"				{ return symbol(LexerSymbol.DEC_OP, new String("'--'")); }
"'"[a-zA-Z]{1}"'"	{ return symbol(LexerSymbol.LETTER, new String(yytext())); }

{nb}  				{ return symbol(LexerSymbol.NB, new Integer(yytext())); }
{real}  			{ return symbol(LexerSymbol.REAL, new Float(yytext())); }
{id}     			{ return symbol(LexerSymbol.ID, new String(yytext())); }

[\t] 				{yycolumn = yycolumn + 3; }

 /* -------------- Caracteres non pris en compte -------------- */

[\n|\r|\r\n\ ]   {}

/* --------------------------- Erreurs ------------------------ */

. 					{ error("Illegal character <"+ yytext()+">"); }
