package IDE;

import java.util.Scanner;

public class componente {

	
	public static void main(String[]args) {
	double ang;
    Scanner leer = new Scanner(System.in);
    
        System.out.print("Introduce un ángulo de (0...360°): ");
        ang = leer.nextDouble();
        anguloCal(ang);
   
        
}
 static void anguloCal(double a){
    
    double ang = Math.toRadians(a);
    System.out.println("Seno de " + a + " es: " + Math.sin(ang) );
}
 
 
}
