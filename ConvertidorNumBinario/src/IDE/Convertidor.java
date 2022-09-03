package IDE;

import java.util.Scanner;

import Main.MenuP;

public class Convertidor {

	
	public static void main (String[]args) {
		
		int num;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Dijite Numero Decimal a Convertir:\n");
		num = leer.nextInt();
		
		
		String binary = Integer.toBinaryString(num);
		System.out.println("El numero Binario de "+num+" es: "+binary);
		
		System.out.println("\n");
		MenuP.main(args);
		
	}
	
}
