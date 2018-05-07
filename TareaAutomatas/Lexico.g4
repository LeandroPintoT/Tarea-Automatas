grammar Lexico;


r  : 'hello' ID ;         			// match keyword hello followed by an identifier

ID : [a-zA-Z_]+[a-zA-Z0-9_-]* ;     // un id puede empezar con letras o _ y puede ser seguido o no de letras, numeros, _ y -

WS : [ \t\r]+ -> skip ; 			// skip spaces, tabs, newlines

/*sentencia: declaracion_int | declaracion_real | declaracion_bool | declaracion_string | declaracion_const | muestra | leer |
			condicional | operacion_entera | operacion_real | while | for | asignacion_int | asignacion_real | asignacion_bool |
			asignacion_string | asignacion_const | comparacion | funcion;
			
			
declaracion_int: ENTERO ID SALTO;
declaracion_real: REAL ID SALTO;
declaracion_bool: BOOL ID SALTO;
declaracion_string: STRING ID SALTO;


asignacion_int: ID ASIGN NUM SALTO;
asignacion_real: ID ASIGN FLOAT SALTO;
asignacion_bool: ID ASIGN SINO SALTO;
asignacion_string: ID ASIGN STR SALTO;*/

//tipos de dato
fragment SALTO	: '\n'			;
fragment DIG	: [0-9] 		;
fragment PUNTO	: '.'			;
fragment TRUE	: 'veridico'	;
fragment NOTRUE	: 'fraudulento'	;


NUM: 	DIG+ 				;
FLOAT:	NUM PUNTO NUM		; 
SINO: 	TRUE | NOTRUE		;
STR: 	'"'.*?'"'			;

MAIN: 'main';

//variables
REAL: 'real';
ENTERO: 'int';
BOOL: 'bool';
STRING: 'string';


//output input
MUESTRA: 'muestra';
LEE: 'leer';

//operadores matematicos
SUMA: '+';
RESTA: '-';
MULT: '*';
DIV: '/';
MOD: '%';

//operadores logicos
AND: 'and';
OR: 'or';
NOT: '!';

//operadores logicos x2
MAYOR: '>';
MENOR: '<';
MAIG: '>=';
MEIG: '<=';
IG: '==';
NIG: '!=';

//condicionales
IF: 'if';
ELSE: 'else';
SWITCH: 'switch';

//estructuras repetitivas
WHILE: 'while';
FOR: 'for';

//funciones matematicas
SQRT: 'sqrt';
FIB: 'fib';		//fibonacci
COS: 'cos';
SEN: 'sin';
PRIM: 'prim';	//primos
POT: 'pou';

//asignacion
ASIGN: '=';

//parentesis
LLI: '{';
LLD: '}';
PI: '(';
PD: ')';
PCI: '[';
PCD: ']';

