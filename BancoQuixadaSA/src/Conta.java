
abstract public class Conta {
	private int numero;
	private double saldo;
	private String nome_titular;
	

	 public Conta(int num,  String nome) {
		super();
		setNome_titular(nome);
		setNumero(num);
		setSaldo(0);
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", nome_titular=" + nome_titular + "]";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNome_titular() {
		return nome_titular;
	}

	public void setNome_titular(String nome_titular) {
		this.nome_titular = nome_titular;
	}
	
	public void debitar(double valor) {
		setSaldo(getSaldo() - valor);
	}
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
