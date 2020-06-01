package aulaHerancaVeiculo;

public class AviaoJato  extends Veiculo{
	public AviaoJato(String idString, double combustivel, double consumo){
		super(idString, combustivel, 50);
	}
	public void consumirCombustivel(double distancia) {
		this.setCombustivel(getCombustivel() - distancia/getConsumo()); 
	}
}
