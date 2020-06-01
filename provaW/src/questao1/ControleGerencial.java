package questao1;

public class ControleGerencial implements Gerenciavel {
	public void cancelarPedido(Pedido p ) {
		p.cancelado = true;
	}
}
