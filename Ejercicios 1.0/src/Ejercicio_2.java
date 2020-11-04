import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Valor del Primer Número");
		num1 = leer.nextInt();
		
		
		System.out.println("Introduce el Valor del Segundo Número");
		num2 = leer.nextInt();
		
		
		System.out.println("El Valor de la Suma es: " + (num1+num2));
		System.out.println("El Valor de la Resta es: " + (num1-num2));
		System.out.println("El Valor del Producto es: " + (num1*num2));
		System.out.println("El Valor de la División es: " + (num1/num2));
		
		
		
		
		
	}

}
