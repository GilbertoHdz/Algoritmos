package eje_resueltos;

import java.util.Scanner;

/* Ejercicio 9: El sueldo neto de un vendedor se calcula como la suma de 
 * un sueldo básico de $2’500.000.00 más el 12% del monto total vendido.
 * Diseñe un algoritmo que determine el sueldo neto de un vendedor sabiendo 
 * que hizo tres ventas en el mes. 
*/
public class Eje9_vendedor {
	
	public static void main(String[] args) {
		
		final float $BASICO = 25000000;
		float venta1, venta2, venta3, ventatot, comision, sueldoneto;
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
        System.out.print( "Digite el valor de la primera venta: $ ");
        venta1 = scanner.nextFloat();
        System.out.print( "Digite el valor de la segunda venta: $ ");
        venta2 = scanner.nextFloat();
        System.out.print( "Digite el valor de la tercera venta: $ ");
        venta3 = scanner.nextFloat();
		
        ventatot = venta1 + venta2 + venta3;
        comision = ventatot * 12 / 100;
        sueldoneto = $BASICO + comision;
        
        
        System.out.println("**********************************************");
        System.out.println( "Venta total: $ " + ventatot ) ; 
        System.out.println( "Comision: $ " + comision ) ; 
        System.out.println( "Sueldo neto: $ " + sueldoneto ) ; 
        
	}

}
















