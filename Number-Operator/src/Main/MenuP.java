package Main;

import java.util.Scanner;

import IDE.Generador;
import IDE.Sumador;


public class MenuP {

	
	public static void main(String[]args) {
		
		
		Scanner leer = new Scanner(System.in);
		
		int opc;
		
		System.out.println("Menu principal \n1. Generador de numero aleatorio \n2. Sumador de dos numeros \n3. Salir");
		opc=leer.nextInt();
		
		do {
		switch(opc) {
		case 1:
			Generador.main(args);
			break;
			
		case 2:
			Sumador.main(args);
			break;
			
		case 3:
			System.exit(0);
			default:
			break;
			
		}
		  }while(opc>=3);
	}
}
