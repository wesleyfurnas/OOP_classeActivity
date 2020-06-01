package aulaHerancaVeiculo;

public class Moto extends Veiculo {
	public Moto(String idString, double combustivel, double consumo){
		super(idString, combustivel, 20);
	}
	public void consumirCombustivel(double distancia) {
		this.setCombustivel(getCombustivel() - distancia/getConsumo()); 
	}
}
