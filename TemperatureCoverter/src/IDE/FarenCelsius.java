package IDE;

import java.text.DecimalFormat;
import java.util.Scanner;import Main.MenuP;

public class FarenCelsius {
	
	public static void main(String[]args) {
		
		
		DecimalFormat decimal = new DecimalFormat("#.00");
		Scanner leer = new Scanner (System.in);
		
	
		double tem;
		double Conver;
		double C;
		
		System.out.println("Ingrese la temperatura en grados Farenheit: ");
		tem = leer.nextDouble();
		
		Conver = tem - 32;
		C = Conver / 1.8;
		
		System.out.println(decimal.format(tem) + " Grados Fareheit = " + decimal.format(C)+" grados Celsius");
		
		System.out.println("\n");
		MenuP.main(args);
	}

}
