package questao1;

import java.util.ArrayList;

public class Pedido {	
	
	ArrayList <ItemPedido>  itPedido = new ArrayList<ItemPedido>();
	boolean cancelado;
	public Pedido() {
		this.cancelado = false;
	}
	
	public void adicionarItemPedido( ItemPedido i) {
		 itPedido.add(i);
	 }
	public double obterValorTotalPedido() {
		double soma = 0;
		for (ItemPedido itemPedido : itPedido) {
			soma = soma + itemPedido.obterValorItem();
		}
		return soma;
	}
}
