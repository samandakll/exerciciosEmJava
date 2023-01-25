package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio_1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double nota;
		
		do {
			System.out.println("Informe uma nota de 0 a 10: ");
			nota = entrada.nextDouble();
			
		} while (nota > 10 || nota < 0 );
		System.out.println("Nota:" + nota);
		
	

		entrada.close();
	}

}
