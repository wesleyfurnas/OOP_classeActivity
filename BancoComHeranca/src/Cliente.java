import java.io.ObjectInputStream.GetField;

public class Cliente {
	private String nome;
	private String CPF;
	ContaPoupanca poupanca;
	ContaCorrente corrente;
	ContaEspecial especial;
	public Cliente(String nome, String cPF, ContaPoupanca poupanca, ContaCorrente corrente, ContaEspecial especial) {
		super();
		this.nome = nome;
		this.CPF = cPF;
		this.poupanca = poupanca;
		this.corrente = corrente;
		this.especial = especial;
	}
	public Cliente() {
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public double getTotal() {
		double total = 0 ;
		ContaCorrente corre = getCorrente();
		ContaPoupanca poupe = getPoupanca();
		ContaEspecial espe = getEspecial();
		
		if (poupe instanceof ContaPoupanca) {
			
			total = total + getPoupanca().getSaldo();
		}
		if ( getCorrente() != null) {
			total = total + getCorrente().getSaldo();
		}
       if (getEspecial() != null) {
		  total = total + getEspecial().getSaldo();
		}
		return total;
	}
	public ContaPoupanca getPoupanca() {
		return poupanca;
	}
	public void setPoupanca(ContaPoupanca poupanca) {
		this.poupanca = poupanca;
	}
	public ContaCorrente getCorrente() {
		return corrente;
	}
	public void setCorrente(ContaCorrente corrente) {
		this.corrente = corrente;
	}
	public ContaEspecial getEspecial() {
		return especial;
	}
	public void setEspecial(ContaEspecial especial) {
		this.especial = especial;
	}
	
	
}
