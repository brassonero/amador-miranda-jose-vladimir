Proceso ListaAlRevesi
	Definir lista Como Entero;
	Dimension lista[10];
	
	Definir i Como Entero;
	
	Para i Desde 1 Hasta 9 Con Paso 1 Hacer
		Imprimir "Dame un numero: ";
		Leer lista[i];
	FinPara
	
	Para i <- 9 Hasta 1 COn Paso -1 Hcer 
		Imprimir lista[i];
	FinPara
	
	Imprimir "Otra forma: ";
	
	Para i <- 0 Hasta 9 Con PAso 1 Hcer
		Imprimir lista[9 - i];
	FinPara
	
	
FinProceso