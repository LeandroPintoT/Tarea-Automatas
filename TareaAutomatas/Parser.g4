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


declaracionvar	:	variable ID SALTO
				|	variable asignvar SALTO
				;


variable	:	REAL
			|	BOOL
			|	ENTERO
			|	STRING
			;


asignvar	:	ID ASIGN NUM
			|	ID ASIGN BOOL
			|	ID ASIGN ENTERO
			|	ID ASIGN STRING
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
		
muestra	:	MUESTRA COM ID COM SALTO
		;
		
leer	: ID ASIGN LEE SALTO 
		;

fors	:	FOR asignvar PIP operaciones LLI bloque LLD
		;


condicional	 :	IF bloque_condicional
				(ELSE bloque_condicional)?
				;	

bloque_condicional 	: 	PI operaciones PD LLI bloque LLD
					| PI operaciones PD sentencia
					;	
					