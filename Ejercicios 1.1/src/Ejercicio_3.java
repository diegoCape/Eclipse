import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {

		int lado1 = 0, lado2 = 0, lado3 = 0;

		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce los Gradosº del Lado 1 del Triángulo");
		lado1 = leer.nextInt();
		
		System.out.println("Introduce los Gradosº del Lado 2 del Triángulo");
		lado2 = leer.nextInt();
		
		System.out.println("Introduce los Gradosº del Lado 3 del Triángulo");
		lado3 = leer.nextInt();
		
		
		if ((lado1 == lado2) && (lado1 == lado3)) {
			
			System.out.println("Tu Triángulo es Equilátero");
			
		}else if (((lado1 == lado2) && (lado2 != lado3)) || ((lado1 == lado3) && (lado1 != lado2)) || ((lado2 == lado3) && (lado2 != lado1))) {
			
			System.out.println("Tu Triángulo es Isósceles");
			
		}else if ((lado1 != lado2) && (lado1 != lado3)){
			
			System.out.println("Tu Triángulo es Escaleno");
		}
		

	}
}
