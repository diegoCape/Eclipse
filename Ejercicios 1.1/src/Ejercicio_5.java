import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Número del que Quieras Saber su Tabla de Multiplicar");
		num = leer.nextInt();
		
		
		for (int i = 1; i < 11; i++) {
			
			System.out.println(num*i);
			
		}
			

	}

}
