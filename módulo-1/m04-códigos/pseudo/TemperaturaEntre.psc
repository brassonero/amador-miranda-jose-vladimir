Proceso TemperaturaEntre
	DEFINIR Temp COMO real;
	
	IMPRIMIR "Dame Temp: ";
	LEER Temp;
	
	SI (Temp >= 15 Y Temp < 23) O (Temp > 30 Y Temp <= 34) ENTONCES
		IMPRIMIR "Está en el intervalo";
	SINO
		IMPRIMIR "No está en el intervalo";
	FINSI
FinProceso
