
public class ContaCorrente extends Conta {
	private double imposto;
	public ContaCorrente(double saldo, int numero, int agencia, double taxaJuros, double imposto) {
		super(saldo, numero, agencia, taxaJuros);
		setImposto(imposto);
	}
	public ContaCorrente() {
		
	}
	public void aplicarImposto() {
		setSaldo(getSaldo()*(1 - getImposto()));
	}
	public void aplicarImposto(double imposto) {
		setSaldo(getSaldo()*(1 - imposto));
	}
	public double getImposto() {
		return this.imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
}
