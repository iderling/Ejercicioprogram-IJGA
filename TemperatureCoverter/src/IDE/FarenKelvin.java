package IDE;

import java.text.DecimalFormat;
import java.util.Scanner;

import Main.MenuP;
import constructor.Fraccion;

public class FarenKelvin {
	
	public static void main(String[]args) {
		
		DecimalFormat decimal = new DecimalFormat("#.00");
		Scanner leer = new Scanner(System.in);
		Fraccion frac = new Fraccion(5,9);

		
		double tem;
		double k1;
		double k2;
		double k;
		double fracc= 0.55555;
		
		System.out.println("Ingrese la temperatura en grados Farenheit: ");
		tem = leer.nextDouble();
		
		k1= tem - 32;
		k2 =  fracc * k1;
		k = k2 + 273.15;
		
		
		System.out.println(decimal.format(tem) + " Grados Farenheit= " + decimal.format(k)+" grados Kelvin");
	      
		
		System.out.println("\n");
		MenuP.main(args);
		
	}

	}
	

