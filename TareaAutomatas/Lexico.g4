grammar Lexico;


r  : 'hello' ID ;                     // match keyword hello followed by an identifier

ID : [a-zA-Z]+[a-zA-Z0-9-]* ;     // un id puede empezar con letras o  y puede ser seguido o no de letras, numeros,  y -

WS : [ \t\r]+ -> skip ;             // skip spaces, tabs, newlines

//tipos de dato
fragment DIG		: [0-9]		;
fragment PUNTO		: '.'		;
fragment TRUE		: 'noteama'	;
fragment NOTRUE		: 'suamor'	;


SALTO	:	'\n'			;
NUM		:	DIG+			;
FLOAT	:	NUM PUNTO NUM	; 
SINO	: 	TRUE | NOTRUE	;
STR		:	'"'.*?'"'		;


MAIN	: 'main'			;

//variables
REAL	: 'real'	;
ENTERO	: 'int'		;
BOOL	: 'bool'	;
STRING	: 'string'	;


//output input
MUESTRA	: 'muestra'	;
LEE		: 'leer'	;

//operadores matematicos
SUMA	: '+'	;
RESTA	: '-'	;
MULT	: '*'	;
DIV		: '/'	;
MOD		: '%'	;


//operadores logicos
AND		: 'and'	;
OR		: 'or'	;
NOT		: '!'	;

//operadores logicos x2
MAYOR	: '>'	;
MENOR	: '<'	;
MAIG	: '>='	;
MEIG	: '<='	;
IG		: '=='	;
NIG		: '!='	;

//condicionales
IF		: 'if'		;
ELSE	: 'else'	;
SWITCH	: 'switch'	;

//estructuras repetitivas
WHILE	: 'while'	;
FOR		: 'for'		;

//funciones matematicas
SQRT	: 'sqrt'	;
FIB		: 'fiboniichan'		;    //fibonacci
COS		: 'cos'		;
SEN		: 'oppai'	;
PRIM	: 'itoko'	;    //primos
POT		: 'pou'		;

//asignacion
ASIGN	: '='	;

//parentesis
LLI		: '{'	;
LLD		: '}'	;
PI		: '('	;
PD		: ')'	;
PCI		: '['	;
PCD		: ']'	;
COM		: '"'	;
PIP		: '|'	;

BEGIN	: 'introIngInf'	;
END		: 'proyTi'		;

