Proceso SumaNumeroEntero
	DEFINIR N COMO entero;
	
	IMPRIMIR "Dame N:";
	LEER N;
	
	DEFINIR suma COMO entero;
	
	suma <- 0;
	
	DEFINIR n COMO entero;
	
	PARA n <- 1 HASTA N CON PASO 1 ENTONCES
		suma <- suma + n;
	FINPARA

FinProceso
