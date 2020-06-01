package questao1;

public class ItemPedido {
	 Produto iProduto;
	 int qtdProduto;
	 
	 public ItemPedido(Produto p,  int qtd) {
		 this.iProduto =p;
		 this.qtdProduto = qtd;
	 }
	 
	 public double obterValorItem() {
		 return ( iProduto.valorUnitario * this.qtdProduto);
	 }
	 
	 
}
