
public class Poupanca extends Conta{
	private double taxa;
	
	public Poupanca(int num, String nome, double t) {
		super(num,nome);
		setTaxa(t);
	}
	
	public void render(){
		setSaldo(getSaldo() + getSaldo()* getTaxa()/(100.00));
	}
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
}
