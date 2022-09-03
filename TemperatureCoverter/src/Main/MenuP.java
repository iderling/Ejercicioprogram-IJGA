package Main;

import java.util.Scanner;

import IDE.CelsiusFaren;
import IDE.CelsiusKelvin;
import IDE.FarenCelsius;
import IDE.FarenKelvin;
import IDE.KelvinCelsius;
import IDE.kelvinFaren;

public class MenuP {
	
public static void main(String[]args) {
	
	Scanner leer= new Scanner(System.in);
	int opc;
	
	System.out.println("TEMPERATURE COVERTER");
	System.out.println("\n");
	
	System.out.println("Menu principal\n1. Grados Celsius A Fareheit \n2. Grados celcius a Kelvin"
			+ " \n3. Grados Farenheit a Celsius \n4. Grados Farenheit a Kelvin \n5. Grados Kelvin a Celsius"
			+ "\n6. Grados Kelvin a farenheit \n7. Salir");
	
	opc = leer.nextInt();
	
	switch (opc) {
	case 1:
	CelsiusFaren.main(args);
	    break;
	
	case 2:
		CelsiusKelvin.main(args);
		break;
		
	case 3:
		FarenCelsius.main(args);
		break;
		
	case 4:
		FarenKelvin.main(args);
		break;
		
	case 5:
		KelvinCelsius.main(args);
		break;
		
	case 6:
		kelvinFaren.main(args);
		break;
		
	case 7:
		System.exit(0);
		default:
		break;
		
	}
	
}
}
	
