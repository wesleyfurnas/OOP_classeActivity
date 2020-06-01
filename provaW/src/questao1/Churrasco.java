package questao1;

public class Churrasco extends Tiragosto {
	public Churrasco(double valor, int cod) {
		super(valor, cod);
	}
	
	@Override
	public String toString() {
		return "Churrasco [valorUnitario=" + valorUnitario + ", codigoProduto=" + codigoProduto + "]";
	}

	public  double obterValorUnitario() {
		return valorUnitario;
	}
}
