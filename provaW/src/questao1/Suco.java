package questao1;

public class Suco extends Bebida {
	public Suco(double valor, int cod) {
		super(valor, cod);
	}
	@Override
	public String toString() {
		return "Suco [valorUnitario=" + valorUnitario + ", codigoProduto=" + codigoProduto + "]";
	}
	public  double obterValorUnitario() {
		return valorUnitario;
	}
}
