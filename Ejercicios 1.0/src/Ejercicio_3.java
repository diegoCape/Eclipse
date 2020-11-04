import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Valor del Primer Número");
		num1 = leer.nextInt();
		
		System.out.println("Introduce el Valor del Segundo Número");
		num2 = leer.nextInt();
		
		
		if (num1 > num2) {
			System.out.println("El Primer Número es el Mayor");
		}else if (num2 > num1) {
			System.out.println("El Segundo número es el Mayor");
		}else {
			System.out.println("Los Números Son Iguales");
		}
		
		
		
		
		
		
		

	}

}
