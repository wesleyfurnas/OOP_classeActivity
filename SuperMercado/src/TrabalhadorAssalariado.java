
public class TrabalhadorAssalariado extends Trabalhador {
	private double salario;

	public TrabalhadorAssalariado(String name, String sobrenome, String cPF, double salario) {
		super(name, sobrenome, cPF);
		this.salario = salario;
	}
	
		public void  setSalario(double valor) {
		this.salario = valor;
	}
	public String toString() {
		return "TrabalhadorAssalariado [salario=" + salario + ", getName()=" + getName() + ", getSobrenome()="
				+ getSobrenome() + ", getCPF()=" + getCPF() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public double getValor() {
		return this.salario;
	}
	
}
