package eje_resueltos;

import java.util.Scanner;

public class Eje7_hhmmss_restantes {
	
	public static void main(String[] args) {
		
		int hor1, min1, seg1, hor2, min2, seg2, segres, resto;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite la hora MILITAR actual (numero entero): ");
		hor1 = scanner.nextInt();
		
		System.out.println("Digite los minutos actuales (numero entero): ");
		min1 = scanner.nextInt();
		
		System.out.println("Digite los segundos actuales (numero entero): ");
		seg1 = scanner.nextInt();
		
        // Cálculo de la cantidad de segundos que restan para culminar el día: 
		segres = 86400 - (hor1 * 3600 + min1 * 60 + seg1);
		
		 // Descomposición de segres en horas, minutos y segundos
        hor2  = segres / 3600;
        resto = segres % 3600;
        min2  = resto / 60;
        seg2  = resto % 60;
		
        
        System.out.println( "Para terminar el dia, hacen falta: " +  
        hor2 + " horas, " + min2 + " minutos y " + seg2 + " segundos." ) ; 
        
	}

}


