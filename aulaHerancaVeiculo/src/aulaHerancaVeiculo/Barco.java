package aulaHerancaVeiculo;

public class Barco extends Veiculo {
	public Barco(String idString, double combustivel, double consumo){
		super(idString, combustivel, 50);
	}
	public void consumirCombustivel(double distancia) {
		this.setCombustivel(getCombustivel() - distancia/getConsumo()); 
	}
}
