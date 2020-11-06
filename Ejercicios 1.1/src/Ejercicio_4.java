import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		int num = 0;
		boolean marcador = false;
		
		Scanner leer = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Introduce un Número Para Evaluar");
			num = leer.nextInt();
			
			if (num%2 == 0) {
				System.out.println("El Número Introducido es Par");
				
			}else {
				System.out.println("El Número Introducido es Impar");
				
			}
			
			System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
			
		}while (marcador != true);
		
		
		
		
		
		

	}

}
