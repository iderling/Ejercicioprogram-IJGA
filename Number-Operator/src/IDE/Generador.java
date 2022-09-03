package IDE;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import Main.MenuP;

public class Generador {


	public static int generate(int n) {
		
		if(n<0) {
			throw new IllegalArgumentException("El numero no debe de ser negativo");
			
		} 
		
		return ThreadLocalRandom.current().nextInt(0, n + 1);
		
	}
		
    public static void main(String[]args) {
    	
    	int num;
    	int cantNumberAleatorio;
    	Scanner leer= new Scanner(System.in);
    	System.out.println("Digite el rango maximo entre numeros aleatorios:\n");
    	num=leer.nextInt();
    	System.out.println("Dijite la cantidad de numeros aleatorios:\n");
    	cantNumberAleatorio=leer.nextInt();
    	
    	for (int i = 0; i < cantNumberAleatorio; i++) {
    		System.out.println();
            System.out.println(generate(num));
        }
    	
    	System.out.println("\n");
    	MenuP.main(args);
    }
    
    

	}
		

