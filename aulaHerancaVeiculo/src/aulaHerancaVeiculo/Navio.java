package aulaHerancaVeiculo;

public class Navio extends Veiculo {
	public Navio (String idString, double combustivel, double consumo){
		super(idString, combustivel, 20);
	}
	public void consumirCombustivel(double distancia) {
		this.setCombustivel(getCombustivel() - distancia/getConsumo()); 
	}
}
