package questao1;

import java.util.Scanner;

public class Principal {
	public static void main(String args[]) {
		//INSTANCIAR CADA PRODUTO DISPONIVEL : BEBIDA/ SUCO, PRATOPRINCIPAL /MACARRAO, TIRAGOSTO/CHURRASCO, SOBREMESA/DOCE	
	 //  TYPE            valor, codigo
		Suco s = new Suco(2, 100);
		Doce d = new Doce(5, 200);
		Macarrao m = new Macarrao(7, 300);
		Churrasco c = new Churrasco(4, 400);
		
		BDProduto pd = new BDProduto();
		
		pd.adicionarProduto(s);
		pd.adicionarProduto(d);
		pd.adicionarProduto(m);
		pd.adicionarProduto(c);
		System.out.println(pd.toString());
		Produto p;
		ItemPedido iteste;
		// criar pedido         TYPE, QTD
		int fazerNovoPedido = 1 ;
		int prodEscolhido = 0;
		int qtdescolhida = 0; 
		Scanner Sc = new Scanner(System.in);
		Pedido pe = new Pedido();
		while( fazerNovoPedido == 1) {
			System.out.println("Deseja adicionar um pedido  ?");
			System.out.println("1 - para SIM");
			System.out.println("2 - pra NAO ");
			fazerNovoPedido = Sc.nextInt();
			Sc.nextLine();
			if( fazerNovoPedido == 1 ) {
				System.out.println(" ---------------- CARDÁPIO --------------");
				System.out.println(pd.toString());
				System.out.println("Digite o codigo do produto desejado ");
				prodEscolhido = Sc.nextInt();
				Sc.nextLine();
				
				try{
					 p =  pd.procurarProduto(prodEscolhido);
				 }catch(ProdutoNaoEncontrado pn) {
					 System.out.println(pn.getMessage());
				 }finally {
					 System.out.println("ProdutoDisponivel");
					 System.out.println("Digite a quantidade desejada ");
					 qtdescolhida = Sc.nextInt();
					 Sc.nextLine();
					 if (prodEscolhido == 100) {
						 pe.adicionarItemPedido(new ItemPedido(s, qtdescolhida));
					 }else if (prodEscolhido == 200) {
						 pe.adicionarItemPedido(new ItemPedido(d, qtdescolhida));
					 }else if (prodEscolhido == 300) {
						 pe.adicionarItemPedido(new ItemPedido(m, qtdescolhida));
					 }else if (prodEscolhido == 400) {
						 pe.adicionarItemPedido(new ItemPedido(c, qtdescolhida));
					 }
					 System.out.println("Valor total do pedido "  + pe.obterValorTotalPedido());
				 }
				
			}
			
			
		}
		
		BDPedido bdpe = new BDPedido();
		bdpe.adicionarPedido(pe);
		 
		 Pedido procPedido =  bdpe.ProcurarPedido(pe);
		 
		 ControleGerencial cg = new ControleGerencial();
		 cg.cancelarPedido(procPedido); 
		 if(pe.cancelado == true) {
			 System.out.println("Encerrou os pedidos !");
		 }
	}	
}
