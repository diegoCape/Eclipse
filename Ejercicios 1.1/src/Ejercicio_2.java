import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		
		int imp = 0, pago = 0, cambio = 0;
		double iva = 0, total = 0;
		boolean marcador = false;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el Importe de tu Compra (€)");
		imp = leer.nextInt();
		
		
		iva = (imp*0.21);
		total = (imp + iva);
		
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Este es el Costo de IVA que se le Aplicará: " + (iva) + " €");
		System.out.println("El Monto Total de su Compra, Asciende a: " + (total) + " €");
		System.out.println("-----------------------------------------------------------");
		
		
		do {
			
			System.out.println("Introduce la Cantidad Requerida para el Pago de su Compra");
			pago = leer.nextInt();
			
			if (pago < total) {
				System.out.println("El Pago Introducido es Insuficiente, Por Favor Vuelve a Intentarlo");
				System.out.println("------------------------------------------------------------------");
			}else {
				System.out.println("Pago Realizado, Este es su Cambio a Devolver: " + (pago-total) + " €");
				marcador = true;
			}
			
		}while (marcador != true);
		
		
	}

}
