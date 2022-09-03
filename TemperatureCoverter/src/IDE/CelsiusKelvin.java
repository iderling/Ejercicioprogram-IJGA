package IDE;

import java.util.Scanner;

import Main.MenuP;

public class CelsiusKelvin {
	
	public static void main(String[]args) {
		
		Scanner leer= new Scanner (System.in);
		double k;
		double tem;
		
		System.out.println("Ingrese la temperatura en grados celsius: ");
		tem = leer.nextDouble();
		
		k = tem + 273.15;
		
		System.out.println(+tem+" grados Celius = "+ k +" grados Kelvin");
		
		 System.out.println("\n");
		MenuP.main(args);
	}

}
