package questao1;

public abstract class Produto implements Gerenciavel {
	protected double valorUnitario; 
	protected int codigoProduto;
	
	public Produto(double valor, int cod) {
		this.valorUnitario = valor;
		this.codigoProduto = cod;
	}
	public abstract double obterValorUnitario();
	public void cancelarPedido(Pedido p) {
		p.cancelado = true;
	}
}