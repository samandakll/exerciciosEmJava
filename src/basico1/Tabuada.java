package basico1;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a tabuada que deseja : ");
		int numero = entrada.nextInt();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numero + "x" + (i+1) + " = " + (numero * (i+1)));
		}

		entrada.close();
	}



	

}
