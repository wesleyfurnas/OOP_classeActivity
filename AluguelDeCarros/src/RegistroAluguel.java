public class RegistroAluguel {
	private Carro  carroAlugado;
	private double valorAluguel;
	
	public String paraString(){
		return ("\n " + " Valor do aluguel: "+ this.valorAluguel + this.carroAlugado.toString());
	}

	public Carro getCarroAlugado() {
		return carroAlugado;
	}

	public void setCarroAlugado(Carro carroAlugado) {
		this.carroAlugado = carroAlugado;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
}
