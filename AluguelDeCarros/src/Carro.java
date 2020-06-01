public class Carro {
	private String placa, modelo;
	private double valorDiaria;
	
	public Carro(String p, String m, double val) {
		setModelo(m);
		setPlaca(p);
		setValorDiaria(val);
	}
	public double obterValorAluguel(int qtd_dias){
		return qtd_dias*this.getValorDiaria();
	}
	public String toString(){
		return ("Placa: "+ this.getPlaca() + "  Modelo: "+ this.getModelo() + " Valor da diaria: "+this.getValorDiaria());
	}
	public boolean equals(Carro c) {
		return(c.placa.equals(this.getPlaca()));
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
}
