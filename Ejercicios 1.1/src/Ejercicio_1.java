import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		int emp = 0, sal = 0, menos200 = 0, entre200y500 = 0, mas500 = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce el Número de Empleados Cuyos Salarios Quieras Evaluar");
		emp = leer.nextInt();
		
		
		for (int i = 0; i < emp; i++) {
			
			System.out.println("Introduce Ahora un Salario");
			sal = leer.nextInt();
			System.out.println("- - - - - - - - - - - - - ");
			
			
			if (sal < 200) {
				
				menos200 = menos200 + 1;
			}
			
			if ((sal > 200) && (sal < 500)) {
				
				entre200y500 = entre200y500 + 1;
			}
			
			if (sal > 500) {
				
				mas500 = mas500 + 1;
			}
		}
		
		System.out.println("Hay " + menos200 + " Empleados que Ganan Menos de 200 €");
		System.out.println("Hay " + entre200y500 + " Empleados que Ganan Entre 200 y 500 €");
		System.out.println("Hay " + mas500 + " Empleados que Ganan Más de 500 €");
		
		

	}

}
