//Se inicia el programa
Proceso BusquedaMenor
	
	//Se declara una variable llamada "lista" de tipo entero
	Definir lista Como Entero;
	//Se inicia la dimension (tamaño) como arreglo de la variable anterior
	Dimension lista[5];
	
	//Se asigna el valor 4 en la posicion 0 del arreglo
	lista[0] <- 4;
	//Se asigna el valor 2 en la posicion 1 del arreglo
	lista[1] <- 2;
	//Se asigna el valor 1 en la posicion 2 del arreglo
	lista[2] <- 1;
	//Se asigna el valor 5 en la posicion 3 del arreglo
	lista[3] <- 5;
	//Se asigna el valor 3 en la posicion 4 del arreglo
	lista[4] <- 3;
	
	//Se declara la variable llamada "minimo" de tipo entero
	Definir minimo Como Entero;
	
	//Se asigna la posicion 0 de la varianble "lista" a la variable "minimo"
	minimo <- lista[0];
	
	//Se declara una variable iteradora "i" de tipo entero
	Definir i Como Entero;
	
	//Se inicia un "ciclo for" con la variable iteradora "i" como parametro de entrada que recorre desde 0 hasta 4 con un incremento de uno
	Para i <- 0 Hasta 4 Con Paso 1 Hacer
		//Se inicia una "condicional if" que pregunta si la variable "lista" junto con el recorrido del iterador "i" es menor que la variable "minimo"
		Si lista[i] < minimo Entonces
			//Si la condicion anterior se cumple la variable "lista" con el recorrido del iterador "i" se agrega la variable "minimo"
			minimo <- lista[i];
		//Se termina la "condicional if"
		FinSi
	// Se termina el "ciclo for"
	FinPara
	
	//Se manda a imprimir la variable "minimo" despues de terminar el "ciclo for"
	Imprimir "Minimo: " minimo;
//Se termina el programa
FinProceso
