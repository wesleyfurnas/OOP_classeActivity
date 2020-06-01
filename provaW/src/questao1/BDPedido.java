package questao1;

import java.util.ArrayList;

public class BDPedido {
	ArrayList<Pedido> pedidosFeitos = new ArrayList<Pedido>();
	
	public void adicionarPedido(Pedido pe) {
		pedidosFeitos.add(pe);
	}
	public Pedido ProcurarPedido(Pedido pe) {
		for (Pedido pedido : pedidosFeitos) {
			if(pedido.equals(pe)) 
				return pedido;
		}
		return null;
	}
	@Override
	public String toString() {
		return "BDPedido [pedidosFeitos=" + pedidosFeitos + "]";
	}
	
}
