// SOBRECARREGAR UM MÉTODO É DEFINIR VARIOS REQUISÕES DE PARAMETROS PARA UM MESMO IDENTIFICADOR DE METODO 
// EX:
// acelerar(int );
//acelerar(doubl, double);


public class Carro extends Veiculo{
	
	public Carro() {
		this.velocidade =0;
	}
	public Carro(int velocidade) {
		super();
		this.velocidade = velocidade;
	}
}
