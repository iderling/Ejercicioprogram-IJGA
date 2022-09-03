package IDE;

import java.text.DecimalFormat;
import java.util.Scanner;

import Main.MenuP;

public class Calculator {

	public static void main(String[]args) {
		
		Scanner leer = new Scanner(System.in);
		DecimalFormat decimal = new DecimalFormat("#.00");
		
		double ymax1;
		double ymax;
		double gravedad = 9.8; 
		double Vo2;
		double Vo;
		double ang;
		double sen2;
		
		
		System.out.println("AlTURA MAXIMA DE UN MOVIMIENTO PARABOLICO");
		
		System.out.println("Digite la velocidad inicial en m/s");
		Vo = leer.nextDouble();
		System.out.println("Digite el Angulo de Lanzamiento");
		ang= leer.nextDouble();
		
		double a = Math.toRadians(ang);
		double sen = Math.sin(a);
		
		Vo2= Vo * Vo ;
		sen2= sen * sen ;
		double den= 2* gravedad;
		ymax = Vo2 * sen2 ; 
		ymax1= ymax / den ;
		
		
		System.out.println(" La Altura maxima es: "+decimal.format(ymax1)+" m ");
		
		System.out.println("\n");
		MenuP.main(args);
	}

}
