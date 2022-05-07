Proceso NumeroMayor
	Definir primero, secondo Como Entero;
	
	Imprimir "Dame un numero: ";
	Leer primero;
	
	Imprimir "Dame otro numero: ";
	Leer secondo;
	
	Si (primero < secondo) Entonces
		Imprimir secondo;
	FinSi
	Si(secondo > primero) Entonces
		Imprimir primero;
	FinSi
	Si(secondo = primero) Entonces
		Imprimir "Son iguales";
	FinSi
	
FinProceso
