package eje_resueltos;

import java.util.Scanner;
/*
 Ejercicio 3:- 
Una instituci�n ben�fica europea ha recibido tres donaciones en 
soles, dolares y marcos. La donaci�n ser� repartida en tres rubros: 
70% para la implementaci�n de un centro de salud, 
20% para un comedor de ni�os y el resto para gastos administrativos. 
Dise�e un algoritmo que determine el monto en euros que le corresponde a 
cada rubro. Considere que: 
1 d�lar = 3.52 soles, 
1 d�lar = 2.08 marcos, 
1 d�lar = 1.07 euros.
 */
public class Eje3_donaciones {
	
	public static void main(String[] args) {
		 double csoles, cdolares, cmarcos, ceuros, rubro1, rubro2, rubro3 ;
		 
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite la cantidad de dinero en soles: $ ");
		csoles = scanner.nextDouble();
		
		System.out.print("Digite la cantidad de dinero en dolares: $ ");
		cdolares = scanner.nextDouble();
		
		System.out.print("Digite la cantidad de dinero en marcos: $ ");
		cmarcos = scanner.nextDouble();
		
		
        ceuros = (csoles / 3.52 + cdolares + cmarcos / 2.08) * 1.07;
        rubro1 = ceuros * 0.70;
        rubro2 = ceuros * 0.20;
        rubro3 = ceuros * 0.10;
		
        System.out.println(" ");
        System.out.println( "Rubro 1 para salud: $ " + rubro1 + " euros");
        System.out.println( "Rubro 2 para comedor: $ " + rubro2 + " euros");
        System.out.println( "Rubro 3 para gastos de admon: $ " + rubro3 + " euros");
		
	}

}
