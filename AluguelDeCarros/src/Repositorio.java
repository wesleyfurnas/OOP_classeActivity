import java.util.Arrays;

public class Repositorio {
	Carro[] carros = new Carro[4];
	
	public Repositorio() {
		this.carros[0] = new Carro("A","FUSCA",100);
		this.carros[1] = new Carro("B","FUSCA",100);
		this.carros[2] = new Carro("C","FUSCA",100);
		this.carros[3] = new Carro("D","FUSCA",100);
	}
	public Carro obterCarro(String placa) {
		int i = 0;
		while( this.carros[i] != null ){
			if( this.carros[i].getPlaca().equals(placa) ){
				return this.carros[i];
			}else {
				i++;
			}
		}
		return null;
	}
	@Override
	public String toString() {
		return " Repositorio [carros=" + Arrays.toString(carros) + "]";
	}
	
}
