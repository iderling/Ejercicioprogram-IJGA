package IDE;

import java.util.Scanner;

import Main.MenuP;

public class Sumador {
	
	public static void main(String[]args) {
		
		Scanner leer = new Scanner (System.in);
		int num1= 0;
		int num2= 0;
		int sumador=0;
		
		System.out.println("Digite primer valor:\n");
		num1=leer.nextInt();
		System.out.println("Digite segundo valor:\n");
		num2=leer.nextInt();
		
		sumador = num1 + num2;
		
		System.out.println(" El valor de la suma es de:"+sumador);
		
		System.out.println("\n");
		MenuP.main(args);
	
	}

}
