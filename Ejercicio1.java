package pruebas;
import java.util.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		long Lim = 0, compara = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero:");
		String numero = entrada.nextLine();
		
		System.out.println("Introduce la cantidad de digitos: ");
		int k = entrada.nextInt();
		
		System.out.println("Cuantas veces desea repetir la aplicacion?");
		int t = entrada.nextInt();
		
		for (int i = 1; i <= t; i++) {
			//3675356291
			//2709360626
			int inicio = 0;
			for(int j = k; j <= numero.length(); j++) {							
				String N_numero = numero.substring(inicio, j);								
				int salto = 1, evalua = 0;				
				long Maximo = 1;
				for(int a = salto; a <= N_numero.length();a++) {					
					Lim = Long.parseLong(N_numero.substring(evalua,a));					
					Maximo = (Lim * Maximo);
					evalua++;					
				}						
				inicio++;
				if(Maximo > compara) {
					compara = Maximo;	
				}
				//36753, 67535, 75356, 53562, 35629 and 56291				
			}	
			System.out.println(compara);
		}
	}
}
