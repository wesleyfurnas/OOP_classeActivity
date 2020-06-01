
public class TrabalhadorHorista  extends Trabalhador {
	private int horas_trabalhadas;
	private double valor_hora;
	
	public TrabalhadorHorista(String name, String sobrenome, String cPF, int horas_trabalhadas, double valor_hora) {
		super(name, sobrenome, cPF);
		this.horas_trabalhadas = horas_trabalhadas;
		this.valor_hora = valor_hora;
	}
	
	public int getHoras_trabalhadas() {
		return horas_trabalhadas;
	}
	public void setHoras_trabalhadas(int horas_trabalhadas) {
		this.horas_trabalhadas = horas_trabalhadas;
	}
	public double getValor_hora() {
		return valor_hora;
	}
	public void setValor_hora(double valor_hora) {
		this.valor_hora = valor_hora;
	}
	
	public double getValor() {
		return this.horas_trabalhadas * this.valor_hora;
	}
	
	
	
}
