package Main;

import java.util.Scanner;

import IDE.identificador;

public class MainP {

	
public static void main(String[] args) {
		
		int opc;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Menu Principal\n1 Identificador de numero Primo\n2 Salir"   );
		

		opc= in.nextInt();
		
	      while (opc<=2) {
	    	  
	    	  switch(opc) {
				case 1:
					identificador.main(args);
					break;
					
				case 2:
					System.exit(0);
					default:
					break;
				
				
				}
	    	  
	      }
	    	  
	    	  
	    	  
	  }
			
			
}
			
				
			
			

		
	

