import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		float niños = 0, niñas = 0, alumnos = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el NÃºmero de Niños en el Curso Actual");
		niños = leer.nextInt();
		
		System.out.println("Introduce el NÃºmero de Nniñas en el Curso Actual");
		niñas = leer.nextInt();
		
		alumnos = (niños + niñas);
		
		System.out.println("El Porcentaje de NiÃ±os es: " + (niños/alumnos));
		System.out.println("El Porcentaje de NiÃ±as es: " + (niñas/alumnos));
		
		
		
		
	}
}
