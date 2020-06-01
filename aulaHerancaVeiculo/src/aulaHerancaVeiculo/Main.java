package aulaHerancaVeiculo;


// @autor : JOSÉ WESLEY ARAÚJO DE OLIVEIRA
// QUESTÕES:
// 1 - MÉTODOS CRIADOS
// 2 - IMPRIMIR UMA MENSAGEM AO USUÁRIO APÓS VERIFICAR O ESTACIONAMENTO
// 3 - PODE. TERIA OS MÉTODOS AOS QUAIS A IMPLEMENTAÇÃO PODE VARIAR DE VEÍCULO PARA VEÍCULO. CLASSES TERRESTRE, MARÍTMO
//	   E AÉREO DEVEM SER ABSTRATAS, POIS, NÃO PODEM SER INSTANCIADAS.
// 4 - NAS LINHAS 16 - 20 DA MAIN, OS VEÍCULOS SÃO CRIADOS. NAS LINHAS 22- 27 OS CARROS VÃO A PASSEIO. 
//	   AO FINAL, A QUANTIDADE DE COMBÚSTIVEL RESTANTE É MOSTRADA NO CONSOLE.
public class Main {
public  static void  main(String[] args) {
	int a = 5 ;
	Estacionamento E = new Estacionamento();
	
	Carro c = new Carro("CCC", 100.0, 10);
	Moto M = new  Moto("MMM", 100.0, 10);
	Navio N = new Navio("NNN", 100.0, 10);
	AviaoBimotor Ab = new AviaoBimotor("ABM", 100.0, 10);
	AviaoJato  Av = new AviaoJato("AVJ",100.0 , 10);
	
	// Passear nos veículos
	c.consumirCombustivel(10);
	M.consumirCombustivel(10);
	N.consumirCombustivel(10);
	Ab.consumirCombustivel(10);
	Av.consumirCombustivel(10);
	
	// estacionar veiculos, excetor Aviao Jato
	E.add_Veiculo(c);
	E.add_Veiculo(M);
	E.add_Veiculo(N);
	E.add_Veiculo(Ab);
	
	//tentar remover Aviao jato sem que ele esteja no estacionamento E
	E.rm_Veiculo(Av.getId_veiculo());
	
	System.out.println("Combustivel  carro : " + c.getCombustivel());
	System.out.println("Combustivel  moto: " + M.getCombustivel());
	System.out.println("Combustivel  aviaojato: " + Av.getCombustivel());
	System.out.println("Combustivel  Navio: " + N.getCombustivel());
	System.out.println("Combustivel  aviaoBimotor : " + Ab.getCombustivel());
}
}
