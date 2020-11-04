import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		
		double imp = 0, desc = 0;
		String mes = "";
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el Mes Actual");
		mes = leer.next();
		
		System.out.println("Introduce el Importe de tu Compra");
		imp = leer.nextInt();
		
		desc = (imp*0.15);
		
		
		if (mes.equalsIgnoreCase("Octubre")) {
			System.out.println("El Importe te Será Rebajado por Estar en Octubre y Será:" 
		+ (imp-desc) + " €");
		}else {
			System.out.println("El Importe a Cobrarte Será: " + imp + " €");
		}
		

	}

}
