package questao1;

import java.util.ArrayList;

public class BDProduto {
	ArrayList<Produto> prodDisponivel = new ArrayList<Produto> ();
	
	public void adicionarProduto(Produto p) {
		prodDisponivel.add(p);
	}
	public void retirarProduto(int codProduto){
		for (Produto produto : prodDisponivel) {
			if(produto.codigoProduto == codProduto)
			 prodDisponivel.remove(produto);
		}
	}
	public Produto procurarProduto(int codProduto) throws ProdutoNaoEncontrado{
		for (Produto produto : prodDisponivel) {
			if(produto.codigoProduto == codProduto)
				return produto;
		}
		throw new ProdutoNaoEncontrado(Integer.toString(codProduto));
	}
	@Override
	public String toString() {
		return "BDProduto [prodDisponivel=" + prodDisponivel + "]";
	}
	

	
	
}


