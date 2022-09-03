package IDE;

import java.text.DecimalFormat;
import java.util.Scanner;

import Main.MenuP;

public class CelsiusFaren {

public static void main(String[]args) {
	
	
	Scanner leer = new Scanner(System.in);
	double tem;
	double convert;
	double f;
	
	System.out.println("Ingrese la temperatura en grados celsius: ");
	tem = leer.nextDouble();
	
	convert = tem * 1.8 ;
	f = convert + 32;
	
	System.out.println(+tem+" grados Celius = "+ f+" grados farenheit");
	
	 System.out.println("\n");
	MenuP.main(args);
    }

}
		
	
