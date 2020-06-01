package aulaHerancaVeiculo;

public class AviaoBimotor extends Veiculo{
	public AviaoBimotor(String idString, double combustivel, double consumo){
		super(idString, combustivel, 30);
	}
	public void consumirCombustivel(double distancia) {
		this.setCombustivel(getCombustivel() - distancia/getConsumo()); 
	}
}