package Main;

import java.util.Scanner;

import Msc.CalculadorMRU;

public class main {
	public static void main(String[] args) {
		
		int opc;
		
		CalculadorMRU cal= new CalculadorMRU();

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Menu Principal\n1.   CALCULADORA DE VELOCIDAD DEL MRU \n2.  Salir"   );
		
		
		opc  = in.nextInt();
		
		switch(opc) {
		case 1:
			cal.main(args);
			break;
			
		case 2:
			System.exit(0);
		default:
		break;
	
		}
		
		
	}

}
