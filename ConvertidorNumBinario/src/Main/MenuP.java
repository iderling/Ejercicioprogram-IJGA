package Main;

import java.util.Scanner;

import IDE.Convertidor;

public class MenuP {

public static void main(String[]args) {
		
		Scanner leer= new Scanner(System.in);
		int opc;
		
		System.out.println("Menu Principal \n1. Convertidor binario \n2. Salir");
		opc=leer.nextInt();
		
		
		switch(opc) {
		case 1:
			Convertidor.main(args);
			break;
			
		case 2:
		System.exit(0);
		default:
			
		}
		
		
	}
}
