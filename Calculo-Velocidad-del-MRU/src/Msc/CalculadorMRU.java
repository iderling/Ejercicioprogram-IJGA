package Msc;

import java.util.Scanner;

public class CalculadorMRU {
	
	public static void main (String[] args) {
		
		Scanner leer = new Scanner(System.in); 
		
		
		int distancia= 0;
		int tiempo  = 0;
		float velocidad= 0;
		int  medida;
		
		
		System.out.println("Dijite la distancia \n");
		distancia = leer.nextInt();
		System.out.println("Dijite el tiempo\n");
		tiempo = leer.nextInt();
		System.out.println(" Elija unidad de medida\n1. k/h \n2. m/s");
		medida = leer.nextInt();
		
		
		
		velocidad = distancia/tiempo;
		
		
		switch (medida) {
		case 1:
			System.out.println( );
			
			System.out.println("La velocidad es de:" +velocidad+" K/h");
			break;
		
		case 2:
			System.out.println( );
			
			System.out.println("La velocidad es de:" +velocidad+" m/s");
			break;
		}
		
		System.out.println("\n");
		Main.main.main(args);
        }
	

	}

