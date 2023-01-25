package basico1;

import java.util.Scanner;

public class SomaDosDigitos {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero;
		int soma = 0;
		
		System.out.println("Informe um numero inteiro: ");
		numero = entrada.nextInt();
		
		while (numero != 0) {
			soma = soma + ( numero % 10 );
			numero = numero / 10;
			
		}
		
		System.out.println(soma);

		entrada.close();
	}

}
