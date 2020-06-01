
public  abstract class Conta {
	private double saldo;
	private int numero;
	private  int agencia;
	private double taxaJuros;
	
	public Conta() {
		
	}
	public Conta(double saldo, int numero, int agencia, double taxaJuros){
		setSaldo(saldo);
		setNumero(numero);
		setAgencia(agencia);
		setTaxaJuros(taxaJuros);
	}
	public  void sacar(double saque ) {
		setSaldo(getSaldo()- saque);
	}
	public void depositar(double deposito) {
		setSaldo(getSaldo() + deposito);
	}
    
	public void aplicarJuros() {
		setSaldo(getSaldo()*(1- getTaxaJuros()));
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
}
