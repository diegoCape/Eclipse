import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, num3 = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Valor del Primer Número");
		num1 = leer.nextInt();
		
		System.out.println("Introduce el Valor del Segundo Número");
		num2 = leer.nextInt();
		
		System.out.println("introduce el Valor del Tercer Número");
		num3 = leer.nextInt();
		
		
		if (num1 < 0) {
			System.out.println(num1*num2*num3);
		}else {
			System.out.println(num1+num2+num3);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
