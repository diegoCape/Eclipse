import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		

		int varA = 0, varB = 0, aux = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el Valor de la Primera Variable");
		varA = leer.nextInt();
		
		System.out.println("Introduce el Valor de la Segunda Variable");
		varB = leer.nextInt();
		
		aux = varA;
		varA = varB;
		varB = aux;
		
		System.out.println("El Valor de la Primera Variable es: " + varA);
		System.out.println("El Valor de la Segunda Variable es: " + varB);
		
		
	}

}
