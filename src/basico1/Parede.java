package basico1;

public class Parede {
	
	public static void main(String[] args) {
		
		double hp, lp, ha, la, qtd;
		
		hp = 2.6;
		lp = 1.6;
		ha = 0.35;
		la = 0.3;
		
		qtd = (hp * lp) / (ha * la);
		
		System.out.printf("A quantidade de ajulejos a ser usada é de %.2f.", qtd);
		
	}

}
