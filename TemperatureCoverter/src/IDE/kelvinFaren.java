package IDE;

import java.text.DecimalFormat;
import java.util.Scanner;

import Main.MenuP;

public class kelvinFaren {
	
	public static void main(String[]args) {
		
		DecimalFormat decimal = new DecimalFormat("#.00");
		Scanner leer = new Scanner(System.in);
		
		double temp;
		double f;
		
		System.out.println("Ingrese la temperatura en grados Kelvin: ");
		temp = leer.nextDouble();
		
		f = 1.8 * (temp - 273.15) + 32;
		
		System.out.println(decimal.format(temp) + " Grados Kelvin = " + decimal.format(f)+" grados Farenheit");
      
		System.out.println("\n");
		MenuP.main(args);
		
	}

}
