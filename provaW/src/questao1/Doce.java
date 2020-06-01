package questao1;

public class Doce extends Sobremesa{
	public Doce(double valor, int cod) {
		super(valor, cod);
	}
	
	@Override
	public String toString() {
		return "Doce [valorUnitario=" + valorUnitario + ", codigoProduto=" + codigoProduto + "]";
	}

	public  double obterValorUnitario() {
		return valorUnitario;
	}
}