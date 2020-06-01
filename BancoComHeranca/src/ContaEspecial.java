
public class ContaEspecial extends Conta {
	 private double limite;
	 public ContaEspecial(double saldo, int numero, int agencia, double taxaJuros,double limite) {
		 super(saldo,numero,agencia, taxaJuros);
		 setLimite(limite);
	 }
	 public ContaEspecial() {
		 
	 }
 
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public void aplicarJuros() {
		if (getSaldo() > 0) {
		      setSaldo(getSaldo()*(1- getTaxaJuros()));
		}else {
		
			setSaldo(getSaldo()*(1+ getTaxaJuros()));
		}
		
		if(getSaldo() < limite ) {
			setSaldo(getSaldo()-25);
		}
}
	}