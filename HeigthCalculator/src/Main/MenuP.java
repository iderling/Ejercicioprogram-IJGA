package Main;

import java.util.Scanner;

import IDE.Calculator;

public class MenuP {

	public static void main(String[]args) {
		
		Scanner leer = new Scanner(System.in);
		int opc;
		
		System.out.println("Menu principal\n1. Calculo de la Altura Maxima de un Movimiento Parabolico \n2. Salir");
		opc = leer.nextInt();
		
		
		
			switch(opc) {
			
			case 1:
				Calculator.main(args);
				break;
				
			case 2:
				System.exit(0);
				default:
				break;
			
		
		}
		
		
	}
}
