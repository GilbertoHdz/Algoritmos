package eje_resueltos;

import java.util.Scanner;

/*
 Ejercicio 4: En una competencia atlética de velocidad el tiempo se mide en 
 minutos, segundos y centésimas de segundo y, el espacio recorrido se mide
 en metros. Diseñe un algoritmo para determinar la velocidad promedio de un 
 atleta en km/hr. Considere que: 1 hora = 60 minutos, 1 minuto = 60 segundos, 
 1 segundo = 100 centésimas de segundo, 1 kilómetro = 1000 metros. 
 */

public class Eje4_competencias {
	
	public static void main(String[] args) {
		int tmin, tseg, tcen;
		double espmt, thor, espkm, velkmhr;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite el tiempo empleado en minutos: ");
		tmin = scanner.nextInt();
		
		System.out.print("Digite el tiempo empleado en segundos: ");
		tseg = scanner.nextInt();
		
		System.out.print("Digite el tiempo empleado en centesimas de segundos: ");
		tcen = scanner.nextInt();
		
		
		System.out.print("Digite el espacio recorrido en metros: ");
		espmt = scanner.nextDouble();
		
     	// Cálculo del tiempo total empleado en horas
		thor = tmin / 60.0 + tseg / 3600 + (tcen / 100.0) / 3600;
		
		//Cálculo del espacio recorrido en kilómetros:
		espkm = espmt / 1000;
		
		//Cálculo de la celocidad en km/hr
		velkmhr = espkm / thor;
		
		System.out.println(" ");
		System.out.println("Velocidad del atleta: " + velkmhr + " Km/Hr");
		
	}
	
	
}



