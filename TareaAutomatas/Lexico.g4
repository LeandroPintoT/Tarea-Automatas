grammar Lexico;


r  : 'hello' ID ;                     // match keyword hello followed by an identifier

ID : [a-zA-Z]+[a-zA-Z0-9-]* ;     // un id puede empezar con letras o  y puede ser seguido o no de letras, numeros,  y -

WS : [ \t\r]+ -> skip ;             // skip spaces, tabs, newlines

//tipos de dato
fragment DIG		: [0-9]		;
fragment PUNTO		: '.'		;
fragment TRUE		: 'noteama'	;	//pono
fragment NOTRUE		: 'suamor'	;	//rino


SALTO	:	'\n'			;
NUM		:	DIG+			;
FLOAT	:	NUM PUNTO NUM	; 
SINO	: 	TRUE | NOTRUE	;
STR		:	'"'.*?'"'		;

//variables
REAL	: 'real'	;	//numero = tau
ENTERO	: 'int'		;	//katoa
BOOL	: 'bool'	;	//sino = engari
STRING	: 'string'	;	//cadena = aho  -  cadenas = mekameka


//output input
MUESTRA	: 'muestra'	;	//tauira  -  imprimir = ta
LEE		: 'leer'	;	//panui

//operadores matematicos
SUMA	: '+'	;
RESTA	: '-'	;
MULT	: '*'	;
DIV		: '/'	;
MOD		: '%'	;


//operadores logicos
AND		: 'and'	;	//a
OR		: 'or'	;	//ó = ranei
NOT		: '!'	;	//kore

//operadores logicos x2
MAYOR	: '>'	;
MENOR	: '<'	;
MAIG	: '>='	;
MEIG	: '<='	;
IG		: '=='	;
NIG		: '!='	;

//condicionales
IF		: 'if'		;	//ae
ELSE	: 'else'	;	//si no = aee
SWITCH	: 'switch'	;	//interruptor = whakawhiti  -  cambiar = huringa

//estructuras repetitivas
WHILE	: 'while'	;	//ahakoa
FOR		: 'for'		;	//mo

//funciones matematicas
SQRT	: 'sqrt'	;	//pakiaka
FIB		: 'fiboniichan'		;    //fibonacci  -  fiboo
COS		: 'cos'		;	//tuhinga
SEN		: 'oppai'	;	//centro = pokapu
PRIM	: 'itoko'	;   //teina
POT		: 'pou'		;	//mana

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

BEGIN	: 'introIngInf'	;	//home
END		: 'proyTi'		;	//mutunga

