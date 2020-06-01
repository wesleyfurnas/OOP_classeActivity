package aulaHerancaVeiculo;

public class Carro extends Veiculo{
	public Carro(String idString, double combustivel, double consumo){
		super(idString, combustivel, 10);
	}
	public void consumirCombustivel(double distancia) {
		this.setCombustivel(getCombustivel() - distancia/getConsumo()); 
	}
}
