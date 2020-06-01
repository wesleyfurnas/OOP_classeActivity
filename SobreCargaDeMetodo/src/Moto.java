
public class Moto extends Veiculo {
	public Moto() {
		super();  // executa o construtor da superClasse Veicul
		  //this(); se quiser usar o construtor de Moto 
		this.velocidade = 0;
	}
	public Moto(int velocidade) {
		this.velocidade = velocidade;
	}
}
