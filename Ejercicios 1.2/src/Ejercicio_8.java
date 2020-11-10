import java.util.Scanner;

import jdk.swing.interop.SwingInterOpUtils;

public class Ejercicio_8 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		
		
		System.out.println("Introduce los 5 Números");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();
		num4 = leer.nextInt();
		num5 = leer.nextInt();
		
		
		if ((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
			System.out.println("El Primer Número es el Mayor");
			
			if ((num2 < num3) && (num2 < num4) && (num2 < num5)) {
				System.out.println("El Segundo Número es el Menor");
				
			}else if ((num3 < num2) && (num3 < num4) && (num3 < num5)) {
				System.out.println("El Tercer Número es el Menor");
				
			}else if ((num4 < num2) && (num4 < num3) && (num4 < num5)) {
				System.out.println("El Cuarto Número es el Menor");
				
			}else if ((num5 < num2) && (num5 < num3) && (num5 < num4)) {
				System.out.println("El Quinto Número es el Menor");
			}
			
		}else if ((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
			System.out.println("El Segundo Número es el Mayor");
			
			if ((num1 < num3) && (num1 < num4) && (num1 < num5)) {
				System.out.println("El Primer Número es el Menor");
				
			}else if ((num3 < num1) && (num3 < num4) && (num3 < num5)) {
				System.out.println("El Tercer Número es el Menor");
				
			}else if ((num4 < num1) && (num4 < num3) && (num4 < num5)) {
				System.out.println("El Cuarto Número es el Menor");
				
			}else if ((num5 < num1) && (num5 < num4) && (num5 < num4)) {
				System.out.println("El Quinto Número es el Menor");
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
