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
	
	tiburoncin ujaja
			
			hola
			
whiles	:	PI sentencia PD
		;
		
fors	:	FOR stoy probando	
			
asignacion_real: ID ASIGN FLOAT SALTO;
asignacion_bool: ID ASIGN SINO SALTO;
asignacion_string: ID ASIGN STR SALTO;
