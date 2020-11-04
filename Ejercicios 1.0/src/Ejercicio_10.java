import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce un Número");
		num = leer.nextInt();
		
		
		do {
			if ((num%2 == 0) && (num != 0)) {
				System.out.println("El Número es Par");
				break;
			}else if (num == 0) {
				System.out.println("El Número no es Par ni Impar");
			}else {
				System.out.println("El Número es Impar");
				break;
			}
			
			System.out.println("Vuelve a Introducir el Número");
			num = leer.nextInt();
		} while (num == 0);
		
		
		

	}

}
