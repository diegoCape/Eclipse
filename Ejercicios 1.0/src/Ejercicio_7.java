import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		float ni�os = 0, ni�as = 0, alumnos = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Número de Ni�os en el Curso Actual");
		ni�os = leer.nextInt();
		
		System.out.println("Introduce el Número de Nni�as en el Curso Actual");
		ni�as = leer.nextInt();
		
		alumnos = (ni�os + ni�as);
		
		System.out.println("El Porcentaje de Niños es: " + (ni�os/alumnos));
		System.out.println("El Porcentaje de Niñas es: " + (ni�as/alumnos));
		
		
		
		
	}
}
