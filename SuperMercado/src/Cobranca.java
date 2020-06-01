
public abstract class Cobranca implements Pagaveis {
	private double valor;
	
	
	public Cobranca(double valor) {
		super();
		this.valor = valor;
	}


	public double getValor() {
		return this.valor;
	}
}
