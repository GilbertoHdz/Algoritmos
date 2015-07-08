package eje_resueltos;

import java.util.Scanner;

public class Eje2_longitudes {
	
	public static void main(String[] args) {
		
		double ccent, cpulg, cpies, cyard;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite cantidad en metros: ");
		double cmetr = scanner.nextDouble();
		
        ccent = cmetr * 100;
        cpulg = ccent / 2.54;
        cpies = cpulg / 12;
        cyard = cpies / 3;
        
        System.out.println( "Cantidad equivalente en centimetros: " + ccent + " cm");
        System.out.println( "Cantidad equivalente en pulgadas: " + cpulg + " pulgadas"); 
        System.out.println( "Cantidad equivalente en pies: " + cpies + " pies");
        System.out.println( "Cantidad equivalente en yardas: " + cyard + " yardas");
		
	}

}
