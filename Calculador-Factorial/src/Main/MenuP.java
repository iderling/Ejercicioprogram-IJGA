package Main;

import java.util.Scanner;

import IDE.Calculador;

public class MenuP {

	
	public static void main(String[]args) {
		
		int opc;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Menu Principal\n1.   CALCULADORA FACTORIAL \n2.  Salir"   );
		opc = leer.nextInt();
		
		switch (opc) {
		case 1:
			Calculador.main(args);
			break;
			
		case 2:
			System.exit(0);
		     default:
			
		}
		
	}
}
