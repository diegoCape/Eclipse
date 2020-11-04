import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Valor del Número");
		num = leer.nextInt();
		
		
		if (num <= 0) {
			System.out.println("Se ha Producido un Error Inesperado");
		}else {
			System.out.println("Del Número " + num + " su Cuadrado es: " + (num*num) + 
					" Y su Raiz es: " + (num*0.5));
		}
		
		
		
		
		
		
		

	}

}
