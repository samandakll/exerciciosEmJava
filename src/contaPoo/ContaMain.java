package contaPoo;

public class ContaMain {
	
	public static void main(String[] args) {
		
		Conta c1 = new Conta ("Capitu", 123, "45678-9", 2000.98, "25/01/2023");
		System.out.println(c1.informacaoInicial());
		
		c1.depositar(150);
		System.out.println("Saldo atual: " + c1.saldo);
		System.out.println("Rendimento do mês: " + c1.calcularRendimento());
	}
	
	
	

}
