package eje_resueltos;

import java.util.Scanner;

/* Ejercicio 10: Diseñe un algoritmo que determine el porcentaje 
 * de varones y de mujeres que hay en un salón de clases. 
 */
public class Ejec10_porc_saloncla {
	
	public static void main(String[] args) {
		
		double porcvar, porcmuj;
		int varones, mujeres, total;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite el numero de Damas: ");
		mujeres = scanner.nextInt();
		
		System.out.println("Digite el numero Varones: ");
		varones = scanner.nextInt();
		
		
        total = varones + mujeres;
        porcvar = varones * 100.0 / total;
        porcmuj = mujeres * 100.0 / total;
		
        
        System.out.println("**********************************************");
        System.out.println( "Porcentaje de mujeres: " + porcmuj + " %");
        System.out.println( "Porcentaje de hombres: " + porcvar + " %");
		
		
	}

}
