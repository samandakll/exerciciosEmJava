package contaPoo;

public class Conta {

	// Atributos

	String titular;
	int numero;
	String agencia;
	double saldo;
	String dataDeAbertura;

	Conta(String titularInicial, int numeroInicial, String agenciaInicial,
			double saldoInicial, String dataDeAberturaInicial) {
		titular = titularInicial;
		numero = numeroInicial;
		agencia = agenciaInicial;
		saldo = saldoInicial;
		dataDeAbertura = dataDeAberturaInicial;
		
	}
	
	String informacaoInicial() {
		return String.format("O titular %s  da conta %d agência %s possui um saldo inicial de "
				+ "R$%.2f em %s.", titular, numero, agencia, saldo, dataDeAbertura);
	}

	// Metodo
	void sacar(double valor) {
		saldo -= valor;

	}

	void depositar(double valor) {
		saldo += valor;
	}
	
	double calcularRendimento() {
		return saldo * 0.10;
	}

}
