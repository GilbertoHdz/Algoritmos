package eje_resueltos;

import java.util.Scanner;

public class MayorMedioMenor {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa A: ");
		int a=scanner.nextInt();
		
		System.out.println("Ingresa B: ");
		int b=scanner.nextInt();
		
		System.out.println("Ingresa C: ");
		int c=scanner.nextInt();
		
		int mayor;
		int medio;
		int menor;
		
		if (a>b && a>c) {
			mayor=a;
			//medio=Math.max(b, c);
			medio=ObtenerMayor(b, c);
			menor=Math.min(b, c);
		
		}else
		{
			if (b>a && b>c) 
			{
				mayor =b;
				medio=Math.max(a, c);
				menor=Math.min(a, c);
			}else
			{
				mayor=c;
				medio=Math.max(b, a);
				menor =Math.min(b, a);
			}
		}
		
		System.out.println("Mayor: " +mayor);
		System.out.println("Medio: " +medio);
		System.out.println("Menor: " +menor);
		
	}
	
	
	public static int ObtenerMayor(int a,int b){
		return a>b?a:b;
	}
	
	
	
	
}
