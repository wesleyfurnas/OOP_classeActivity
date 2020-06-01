
public class Fidelidade extends Conta{
	private  double bonus;
	
	public Fidelidade(int num, String nome){
		super(num, nome);
		setBonus(0);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public void render(double valor ) {
		setSaldo(getSaldo() + bonus + valor/100);
		setBonus(0);
	}
	
	public void depositar(double valor) {
		super.depositar(valor);
		render(valor);
	}
	
}
