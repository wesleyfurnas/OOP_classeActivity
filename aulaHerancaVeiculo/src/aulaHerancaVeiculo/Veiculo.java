// Polimorfismo é redefinir o método que recebem o mesmo cabeçalho em classes da mesma hierarquia. 
package aulaHerancaVeiculo;

 public abstract class Veiculo {
 private String id_veiculo;
 private double combustivel;
 private double consumo;
 
	 public Veiculo(String idString, double combustivel, double consumo) {
		 this.combustivel = combustivel;
		 this.consumo = consumo;
		 this.id_veiculo = idString;
	 }
	 public abstract void consumirCombustivel(double distancia);
	 public  void abastecer(double combustivel){
		 setCombustivel(getCombustivel() + combustivel); 	 
	 }
	public String getId_veiculo() {
		return id_veiculo;
	}
	public void setId_veiculo(String id_veiculo) {
		this.id_veiculo = id_veiculo;
	}
	public double getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	 
}
