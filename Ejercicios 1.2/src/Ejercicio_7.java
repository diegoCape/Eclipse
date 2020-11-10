
public class Ejercicio_7 {

	public static void main(String[] args) {
		
		int sumaPar = 0, sumaImpar = 0, num = 0;
	
		
		for (int i = 0 ; i < 100; i++) {
			
			num = num + 1;
			System.out.println(num);
			
			if (num%2 == 0) {
				
				sumaPar = sumaPar + num ;
			}else {
				
				sumaImpar = sumaImpar + num;
			}
			
		}
		
		System.out.println(sumaPar);
		System.out.println(sumaImpar);
		
		
		
		
	}

}
