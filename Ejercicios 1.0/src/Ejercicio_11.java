import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		String bach = "", prueba = "";
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce 'Si' o 'si' en Caso de que Poseas un Titulo de Bachiller");
		bach = leer.next();
		
		if (bach.equalsIgnoreCase("Si")) {
			System.out.println("Puedes Acceder al Grado Superior");
		}else {
			System.out.println("No Tienes el Titulo de Bachiller, Pero Puedes Acceder por la Prueba de Acceso:");
			System.out.println("Introduce 'Si' o 'si' en Caso de que Hayas Superado la Prueba de Acceso");
			prueba = leer.next();
			
			if (prueba.equalsIgnoreCase("Si")) {
				System.out.println("Puedes Acceder al Grado Superior");
			}else {
				System.out.println("No Puedes Acceder al Grado Superior");
			}
		}
		
		
	}

}
