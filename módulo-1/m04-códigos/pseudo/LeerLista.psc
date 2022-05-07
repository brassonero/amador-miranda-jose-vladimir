Proceso LeerLista
	
	Definir N Como Entero;
	
	Imprimir "Dame el tamaño de la lista: ";
	Leer N;
	
	Definir lista Como Entero;
	Dimension lista[N];
	
	Definir i Como Entero;
	
	Para i <- 1 Hasta N - 1 Con Paso 1 Hacer
		Imprimir "Posicion " i ": ";
		Leer lista[i];
	FinPara
	
FinProceso
