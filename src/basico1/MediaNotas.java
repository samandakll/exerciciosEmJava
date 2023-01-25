package basico1;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4;
		double qtdAlunosAprovados = 0;
		double qtdAlunosReprovados = 0;
		
		double media = 0;
		double mediaAp = 0;
		double mediaMaior = 0;
		double mediaMenor = 11;
		
	    Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			
			System.out.println("Informe sua nota1 :");
			nota1 = entrada.nextDouble();
			System.out.println("Informe sua nota2 :");
			nota2 = entrada.nextDouble();
			System.out.println("Informe sua nota3 :");
			nota3 = entrada.nextDouble();
			System.out.println("Informe sua nota4 :");
			nota4 = entrada.nextDouble();
			
			
			media = (nota1 + nota2 + nota3 + nota4) / 4;
			
			if (media >= 7.5) {
				qtdAlunosAprovados ++;
				mediaAp = media;	
			} else  {
				qtdAlunosReprovados ++;
			}
			
			if (media >= mediaMaior) {
				mediaMaior = media;
				
			} else if (media < mediaMenor) {
				mediaMenor = media;
				
			}
		
		}
		
		
		
		System.out.printf("A média total de nota dos alunos aprovados é : %.2f.\n",mediaAp);
		System.out.println("A quantidade de alunos aprovados foi de : " + qtdAlunosAprovados + "." );
		System.out.println("A quantidade de alunos reprovados foi de : " + qtdAlunosReprovados + "." );
		System.out.printf("A maior média é: %.2f.\n", mediaMaior);
		System.out.printf("A menor média é: %.2f.\n", mediaMenor);

		entrada.close();
	}
}
