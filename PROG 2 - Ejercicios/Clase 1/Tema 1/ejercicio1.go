Algoritmo ej1 es
ambiente

i, num, cont : cont 

proceso
	escribir("ingrese un numero entero")
	leer(num)
	si (num >= 0) entonces
		para i := 2  hasta 10 hacer
			si ((num % 1) == 0) hacer
				cont := cont + 1
			fin si
		fin para
		si (cont == 2) entonces
			escribir("el numero es primo")
			sino 
			escribir("el numero no es primo")
		fin si
		sino
		escribir("error el numero es negativo")
	fin si
fin proceso
