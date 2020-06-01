package questao1;

public class ProdutoNaoEncontrado extends Exception {
	private String codProduto;
	
	public  ProdutoNaoEncontrado(String codProduto) {
		super("O produto de código " + codProduto+ " não está cadastrado no sistema: "  );
		this.codProduto= codProduto;
	}
	public String numeroProduto(){
		return codProduto;
	}
	
	
}
