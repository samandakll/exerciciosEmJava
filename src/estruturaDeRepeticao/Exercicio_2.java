package estruturaDeRepeticao;

import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		String senha;
		boolean senhaValida = false ;
		
		do {
			System.out.println("Informe seu nome: ");
			nome = entrada.nextLine();
			System.out.println("Informe senha: ");
			senha = entrada.nextLine();
			
			if (senha.equalsIgnoreCase(nome)) {
				System.out.println("Senha inválida. Informe outra senha: ");
				
			}else {
				senhaValida = true;
				System.out.println("Seu nome é: " + nome + "\nSua senha é: " + senha);
				
			}
			
		} while (!senhaValida);
		

		entrada.close();
	}

}
