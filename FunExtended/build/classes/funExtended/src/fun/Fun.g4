//////////////////////////////////////////////////////////////
//
// Specification of the Fun syntactic analyser.
//
// Developed June 2012 by David Watt (University of Glasgow).
//
// Converted to ANTLRv4 by Simon Gay, August 2015.
//
//
// Extended by Owen Duffy (2447771d), February 2019
//
//////////////////////////////////////////////////////////////


grammar Fun;

// This specifies the Fun grammar, defining the syntax of Fun.

@header{
package ast;
}

//////// Programs

program
	:	var_decl* proc_decl+ EOF  # prog
	;


//////// Declarations

proc_decl
	:	PROC ID
		  LPAR formal_decl_seq? RPAR COLON
		  var_decl* seq_com DOT   # proc

	|	FUNC type ID
		  LPAR formal_decl_seq? RPAR COLON
		  var_decl* seq_com
		  RETURN expr DOT         # func
	;

formal_decl_seq
	:	formal_decl (COMMA formal_decl)* # formalseq
	;

formal_decl
	:	type ID                # formal
	;

var_decl
	:	type ID ASSN expr         # var
	;

type
	:	BOOL                      # bool
	|	INT                       # int
	;


//////// Commands

com
	:	ID ASSN expr              # assn
	|	ID LPAR actual_seq? RPAR       # proccall
							 
	|	IF expr COLON c1=seq_com
		  ( DOT              
		  | ELSE COLON c2=seq_com DOT   
		  )                       # if

	|	WHILE expr COLON          
		  seq_com DOT             # while
		  
//EXTENSION
  	|	FOR ID ASSN expr TO expr COLON
		 seq_com DOT 				#forloop
	|	SWITCH e1 = expr COLON
			(case_stmt)*
			default_case
			DOT						#switch
	;


default_case
	: 'default' COLON 
		seq_com
	;
	
case_stmt 
	: CASE (NUM | FALSE | TRUE | range) COLON 
		seq_com						#case_statement
	;
	//type checking will have to be done on this to ensure it the same as the expr e1
	
range
	: NUM DOT DOT NUM
	;
//EXTENSION
seq_com
	:	com*                      # seq
	;


//////// Expressions

expr
	:	e1=sec_expr
		  ( op=(EQ | LT | GT) e2=sec_expr )?
	;

sec_expr
	:	e1=prim_expr
		  ( op=(PLUS | MINUS | TIMES | DIV) e2=sec_expr )?
	;

prim_expr
	:	FALSE                  # false        
	|	TRUE                   # true
	|	NUM                    # num
	|	ID                     # id
	|	ID LPAR actual_seq? RPAR    # funccall
	|	NOT prim_expr          # not
	|	LPAR expr RPAR         # parens
	;

actual_seq
	:  expr (COMMA expr)*  # actualseq
	;




//////// Lexicon

BOOL	:	'bool' ;
ELSE	:	'else' ;
FALSE	:	'false' ;
FUNC	:	'func' ;
IF		:	'if' ;
INT		:	'int' ;
PROC	:	'proc' ;
RETURN 	:	'return' ;
TRUE	:	'true' ;
WHILE	:	'while' ;

//EXTENSION
FOR		:	'for' ;
TO		:	'to' ;
CASE	:	'case' ;
SWITCH	:	'switch' ;
//EXTENSION

EQ	:	'==' ;
LT	:	'<' ;
GT	:	'>' ;
PLUS	:	'+' ;
MINUS	:	'-' ;
TIMES	:	'*' ;
DIV	:	'/' ;
NOT	:	'not' ;

ASSN	:	'=' ;

LPAR	:	'(' ;
RPAR	:	')' ;
COLON	:	':' ;
DOT	:	'.' ;
COMMA	:	',' ;

NUM	:	DIGIT+ ;

ID	:	LETTER (LETTER | DIGIT)* ;

SPACE	:	(' ' | '\t')+   -> skip ;
EOL	:	'\r'? '\n'          -> skip ;
COMMENT :	'#' ~('\r' | '\n')* '\r'? '\n'  -> skip ;

fragment LETTER : 'a'..'z' | 'A'..'Z' ;
fragment DIGIT  : '0'..'9' ;
