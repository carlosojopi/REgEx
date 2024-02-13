import java.util.Scanner;

public class Par_Impar {
	public static void main (String args[]) {
		
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero por favor");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
			
		} else
			
			System.out.println("El numero " + numero +  " es impar");
	}
}
