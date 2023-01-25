package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String nome, sexo, estadoCivil;
		int idade, salario;
		
		do {
			System.out.println("Informe seu nome: ");
			nome = entrada.nextLine();
			
		} while (nome.length() <=3);
		
		do {
			System.out.println("Informe sua idade: ");
			idade = entrada.nextInt();
			
		} while (idade > 150 || idade < 0);
		
		do {
			System.out.println("Informe seu salário: ");
			salario = entrada.nextInt();
			
		} while (salario <= 0);
		
		do {
			System.out.println("Qual seu sexo: ");
			sexo = entrada.next();
			
		} while (!sexo.equalsIgnoreCase("f") &&
				 !sexo.equalsIgnoreCase("m"));

		
		do {
			System.out.println("Informe seu estado civil: ");
			estadoCivil = entrada.next();
			
		} while (!estadoCivil.equalsIgnoreCase("s") &&
				 !estadoCivil.equalsIgnoreCase("c") &&
				 !estadoCivil.equalsIgnoreCase("v") &&
				 !estadoCivil.equalsIgnoreCase("d"));
		

		entrada.close();
	}
}
