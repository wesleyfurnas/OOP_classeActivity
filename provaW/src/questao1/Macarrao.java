package questao1;

public class Macarrao extends PratoPrincipal{
	public Macarrao(double valor, int cod) {
		super(valor, cod);
	}
	public  double obterValorUnitario() {
		return valorUnitario;
	}
	@Override
	public String toString() {
		return "Macarrao [valorUnitario=" + valorUnitario + ", codigoProduto=" + codigoProduto + "]";
	}
}
