import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		int num = 0, total = 0, cont = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce un Número");
		num = leer.nextInt();
		
		
		do {
			total = total + num;
			
			cont = cont + 1;
		} while (cont != num);
		
		
		System.out.println(total);
		
	}

}
