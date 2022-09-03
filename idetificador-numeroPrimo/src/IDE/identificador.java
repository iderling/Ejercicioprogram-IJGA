package IDE;

import java.util.Scanner;

import Main.MainP;

public class identificador {
	
	
	public static void main(String[]arg) {
		
		Scanner leer= new Scanner(System.in);
		int numero,i=2;
		boolean primo= false;
		
		
		
		System.out.println("Ingrese el numero a evaluar\n");
		numero = leer.nextInt();
		
		while(i <= numero/2) 
		{
			
			if(numero % i==0) {
				
				primo = true;
				break;
				
			}
			
			++i;
			
		}
		
		if (!primo)
			System.out.println("El numero es primo");
		
		else
			System.out.println("El numero no es primo" );
		
		
		
		System.out.println("\n" );
		MainP.main(arg);
		
		
	}
	
}
