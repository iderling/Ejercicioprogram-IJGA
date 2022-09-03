package IDE;

import java.util.Scanner;

import Main.MenuP;

public class Calculador {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		
		
		int num;
		int fac= 1;
		
		System.out.println("Digite un Numero");
		num = leer.nextInt();
		
		
		for (int i=num; i>0; i--) {
			fac= fac*i;
		
		}
		
		System.out.println("EL factorial de "+num+ " es: " +fac);
		
		System.out.println("\n");
		MenuP.main(args);
		
	}

}
