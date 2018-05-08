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
            
asignacion_int: ID ASIGN NUM SALTO;
asignacion_real: ID ASIGN FLOAT SALTO;
asignacion_bool: ID ASIGN SINO SALTO;
asignacion_string: ID ASIGN STR SALTO;