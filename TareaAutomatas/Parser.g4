grammar Parser;

import Lexico;

s 		: sentencia EOF					
		;

programa    :    inicio    sentencia+ finale;

inicio        :    BEGIN;
finale        :    END;

sentencia   :	declaracionvar
            |   asignvar
            |   muestra
            |   leer
            |   condicional
            |   operaciones
            |   fors
            |   whiles
            ;
            
declaracionvar	:	variable ID
				|	variable asignacion
				;

variable	:	REAL
			|	BOOL
			|	ENTERO
			|	STRING
			;
            
asignacion	:	ID ASIGN NUM SALTO
			|	ID ASIGN BOOL SALTO
			|	ID ASIGN ENTERO SALTO
			|	ID ASIGN STRING SALTO
			;
			
whiles	:	PI sentencia PD
		;
		
operaciones	:	sumas+
			;
		
sumas	:	ID SUMA ID
		|	ID SUMA NUM
		|	NUM SUMA ID
		|	NUM SUMA NUM
		;
			
asignacion_real: ID ASIGN FLOAT SALTO;
asignacion_bool: ID ASIGN SINO SALTO;
asignacion_string: ID ASIGN STR SALTO;
