
public class ContaPoupanca extends Conta {
  public ContaPoupanca(double saldo, int numero, int agencia, double taxaJuros) {
	  super(saldo, numero, agencia, taxaJuros);
  }
  public ContaPoupanca() {
	  
  }
  public void aplicarJuros() {
		setSaldo(getSaldo()*(1+ getTaxaJuros()));
	}
}
