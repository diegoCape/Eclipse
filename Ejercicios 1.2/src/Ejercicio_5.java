import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		String entrada = "";
		boolean correcto = false;
		
		
		
		System.out.println("Introduce los Datos Correctos");
		entrada = leer.next();
		
		do {
			if ((entrada.equals("S")) || (entrada.equals("N"))) {
				System.out.println("Has Acertado");
				correcto = true;
				
			}else {
				System.out.println("Error en la Entrada de Datos, Reintenta");
				entrada = leer.next();
				
			}	
		}while (correcto != true);
		
		

	}

}
