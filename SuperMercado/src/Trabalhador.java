
public abstract class Trabalhador implements Pagaveis, NaoMexer{
	private String name;
	private String sobrenome;
	private String CPF;
	
	
	public Trabalhador(String name, String sobrenome, String cPF) {
		super();
		this.name = name;
		this.sobrenome = sobrenome;
		CPF = cPF;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
