//Se inicia el programa
Proceso OrdenamientoBurbuja
    //Se declara la variable llamada "N" de tipo entero
	DEFINIR N COMO ENTERO;
    //Se imprime un mensaje para el usuario
    IMPRIMIR "Dame el tamanyo de la lista a ordenar:";
    //Se lee la variable "N" por parte del usuario
    LEER N;
	//Se declara la variable "lista" de tipo entero
    DEFINIR lista COMO ENTERO;
    //Se asigna la variable "N" al arreglo de la variable "lista" para definir la dimension del arreglo
    DIMENSION lista[N];
    //Se declara una variable iteradora "i" de tipo entero
    DEFINIR i COMO ENTERO;
	
    // Capturamos el valor de cada posicion en la lista
    //Se inicia un "ciclo for" con la variable iteradora "i" como parametro de entrada que recorre desde 0 hasta "N" - 1 con un incremento de uno
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		//Se imprime un mensaje para el usuario agregando la variable iteradora "i" para indicar la posicion
        IMPRIMIR "Dame el valor de la lista en la posicion " i ":";
        //Se lee la variable "lista" por parte del usuario con el tamaño dado por la variable iteradora "i"
        LEER lista[i];
	//Se terima el "ciclo for"
    FINPARA
	
	//COMIENZA ORDENAMIENTO BURBUJA
	//Se declara la variable llamada "burbuja_actual" de tipo entero
    DEFINIR burbuja_actual COMO ENTERO;
    //Se declara la variable llamada "burbuja_siguiente" de tipo entero
    DEFINIR burbuja_siguiente COMO ENTERO;
	//Se declara la variable iteradora "j" de tipo entero
    DEFINIR j COMO ENTERO;
	
    //Iteramos N veces, en cada una aseguramos la burbuja mas grande al final
    //Se inicia un "ciclo for" con la variable iteradora "i" como parametro de entrada que recorre desde 0 hasta "N" - 1 con un incremento de uno
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		
        //Recorremos cada pareja (actual y siguiente)
        //desde `0` hasta `N - 2` (las parejas seran [0, 1], [1, 2], ..., [N-2, N-1])
        //Se inicia un "ciclo for" anidado con la variable iteradora "j" como parametro de entrada que recorre desde 0 hasta "N" - 2 con un incremento de uno
        PARA j <- 0 HASTA N - 2 CON PASO 1 HACER
			
            //Se recupera el valor de la "burbuja_actual" y la siguiente
            burbuja_actual = lista[j];
            burbuja_siguiente = lista[j + 1];
			
            //Se inicia una "condicional if" para saber si la variable "burbuja_actual" es mayor a la variable "burbuja_siguiente"
            SI burbuja_actual > burbuja_siguiente ENTONCES
				
                //Se reasigna el valor de la variable "lista" con su valor iterador "j" a la variable "burbuja_siguiente" si la condicion anterior se cumplio
                lista[j] = burbuja_siguiente;
                //Se reasigna el valor de la variable "lista"con su valor iterador "j" mas 1 a la variable "burbuja_actual"
                lista[j + 1] = burbuja_actual;
			//Se termina la "condicional if"
            FINSI
		//Se termina el "ciclo for"	anidado
        FINPARA
	//Se termina el "ciclo for"	
    FINPARA
	
	//Imprimimos la lista, ahora ordenada
    //Se inicia un "ciclo for" anidado con la variable iteradora "i" como parametro de entrada que recorre desde 0 hasta "N" - 1 con un incremento de uno
    PARA i <- 0 HASTA N - 1 CON PASO 1 HACER
		//Se imprime la variable "lista" con la variable iteradora "i" como valor de su tamaño
        IMPRIMIR lista[i];
	//Se termina el "ciclo for"	
    FINPARA
//Se termina el programa
FinProceso
