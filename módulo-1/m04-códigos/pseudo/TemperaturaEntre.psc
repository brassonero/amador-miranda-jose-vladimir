Proceso TemperaturaEntre
	DEFINIR Temp COMO real;
	
	IMPRIMIR "Dame Temp: ";
	LEER Temp;
	
	SI (Temp >= 15 Y Temp < 23) O (Temp > 30 Y Temp <= 34) ENTONCES
		IMPRIMIR "Est� en el intervalo";
	SINO
		IMPRIMIR "No est� en el intervalo";
	FINSI
FinProceso
