Proceso SumaParesLista
	
	//Definimos N entero y lo leemos del usuario
	Definir N Como Entero;
	
	Imprimir "Dame el tamaño de la lista";
	Leer N;
	
	//Definimos una lista de enteros de tamaño N
	Definir lista Como Entero;
	Dimension lista[N];
	
	Definir i Como Entero;
	
	//Recorremos un iterando que representa el indice
	Para i <- 0 Hasta N - 1 Con Paso 1 Hacer
		//Pedimos el valor de la lista en la posicion i
		imprimir "Posicion " i ": ";
		leer lista[i];
	FinPara
	
	Definir suma Como Entero;
	
	suma <- 0;
	
	Para i <- 0 Hasta N - 1 Con paso 1 Hacer
		Si lista[i] Mod 2 = 0 Entonces
			suma <- suma + lista[i];
		FinSi
	FinPara
FinProceso
