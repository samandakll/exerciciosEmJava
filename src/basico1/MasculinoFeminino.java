package basico1;

import java.util.Scanner;

public class MasculinoFeminino {

	public static void main(String[] args) {

		int sexo;
		int qtM = 0;
		int qtH = 0;

		float altura;
		float somaH = 0;
		float mediaH = 0;
		float maior = 0;
		float menor = 10;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 31; i++) {

			do {
				System.out.println("Qual seu sexo? \nSe mulher digite 1, se homem digite 2: ");
	//			int sexo = entrada.nextInt(); > com int na frente fica errado pois ja foi chamado antes
				sexo = entrada.nextInt();
			} while (sexo < 1 || sexo > 2);

			System.out.println("Informe sua altura: ");
//			float altura = entrada.nextInt(); > com float na frente fica errado pois ja foi chamado antes
			altura = entrada.nextFloat();

			if (sexo == 1) {
				qtM++;

			} else if (sexo == 2) {
				qtH++;
				somaH = somaH + altura;

			} else {
				System.out.println("Opção inválida! Favor digitar opção válida (1 ou 2) ");

			}
			if (altura > maior) {
				maior = altura;

			} else if (altura < menor) {
				menor = altura;

			}
		}

		mediaH = somaH / qtH;

		// a. a maior e a menor altura do grupo;
		System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de " + menor + "m");

		// b. média de altura dos homens;
		System.out.println("A média da altura dos homes é " + mediaH);
		
		// c. o número de mulheres;
		System.out.println("A quantidade de mulheres é de: " + qtM);

		entrada.close();

	}
}
