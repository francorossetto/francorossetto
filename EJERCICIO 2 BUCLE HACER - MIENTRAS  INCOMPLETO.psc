Proceso sin_titulo
	Definir num Como Entero
	Repetir
		N <- MA
		P <- M
		Leer num
		Si num>=N Y num>=P Entonces
			MA <- num
			Si P>=N Entonces
				MIN <- N
			SiNo
				MIN <- P
			FinSi
		SiNo
			Si N>=P Y N>=num Entonces
				MA <- N
				Si P>=num Entonces
					MIN <- num
				SiNo
					MIN <- P
				FinSi
			SiNo
				Si P>=N Y P>=num Entonces
					MA <- P
					Si N>=num Entonces
						MIN <- num
					SiNo
						MIN <- N
					FinSi
				FinSi
			FinSi
		FinSi
		Escribir 'MA ES : ',MA
		Escribir ' MIN ES : ',MIN
		M <- MIN
	Hasta Que num=0
FinProceso
