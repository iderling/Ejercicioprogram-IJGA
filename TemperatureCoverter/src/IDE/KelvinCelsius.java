package IDE;

import java.text.DecimalFormat;
import java.util.Scanner;

import Main.MenuP;

public class KelvinCelsius {
	
	public static void main(String[]args) {
		
		DecimalFormat decimal = new DecimalFormat("#.00");
		Scanner leer = new Scanner(System.in);
		
		double temp;
		double c;
		
		System.out.println("Ingrese la temperatura en grados Kelvin: ");
		temp = leer.nextDouble();
		
		c = temp - 273.15;
		
		System.out.println(decimal.format(temp) + " Grados Kelvin = " + decimal.format(c)+" Grados Celsius");
        
		System.out.println("\n");
		MenuP.main(args);
	}

}
