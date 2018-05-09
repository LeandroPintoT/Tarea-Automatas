grammar Parser;

import Lexico;


s 		: sentencia EOF					
		;


programa    :    inicio sentencia+ finale;

inicio        :    BEGIN;
finale        :    END;


sentencia	:    declaracionvar
            |    asignvar
            |    muestra
            |    leer
            |    condicional
            |    operaciones
            |    fors
            |    whiles
            ;


asignacion_int: ID ASIGN NUM SALTO;


declaracionvar	:	variable ID
				|	variable asignvar
				;


variable	:	REAL
			|	BOOL
			|	ENTERO
			|	STRING
			;


asignvar	:	ID ASIGN NUM SALTO
			|	ID ASIGN BOOL SALTO
			|	ID ASIGN ENTERO SALTO
			|	ID ASIGN STRING SALTO
			;


operaciones	:	operaciones operador operaciones
			|	ID
			|	PI operaciones PD
			;


operador	:	MAYOR
			|	MENOR
			|	MAIG
			|	MEIG
			|	IG
			|	NIG
			| 	SUMA
			|	RESTA
			|	DIV
			|	MULT
			|	MOD
			|	AND
			|	OR
			;


whiles	:	PI operaciones PD LLI bloque LLD
		;


bloque	:	sentencia*
		;


sumas	:	ID SUMA ID
		|	ID SUMA NUM
		|	NUM SUMA ID
		|	NUM SUMA NUM
		;


fors	:	FOR stoy probando
		;


condicional	: 	PI operacion PD LLI block LLD
			|	PI operacion PD stat 
			;
