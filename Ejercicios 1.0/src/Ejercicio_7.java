import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		float niños = 0, niñas = 0, alumnos = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Número de Niños en el Curso Actual");
		niños = leer.nextInt();
		
		System.out.println("Introduce el Número de Niñas en el Curso Actual");
		niñas = leer.nextInt();
		
		alumnos = (niños + niñas);
		
		System.out.println("El Porcentaje de Niños es: " + (niños/alumnos));
		System.out.println("El Porcentaje de Niñas es: " + (niñas/alumnos));
		
		
		
		
	}
}
