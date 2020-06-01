package registerUsers;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Usuario {
	Scanner s = new Scanner(System.in);
	int  id = 0;
	static int cont =1;
	String nome ;
	String sobreNome;
	int idade;
	String cargo;
	double salario;
	
	public Usuario() {
		this.id = cont++;
	}
	public void promover(double percent) {
		this.salario = this.salario + this.salario*percent/100;
	}
	public void register() {
		System.out.println("Digite o nome: ");
		this.nome = s.nextLine();
		System.out.println("Digite o sobreNome: ");
		this.sobreNome = s.nextLine();
		System.out.println("Digite o cargo: ");
		this.cargo = s.nextLine();
		System.out.println("Digite a idade: ");
		this.idade = s.nextInt();
		s.nextLine();
		System.out.println("Digite o salario: ");
		this.salario= s.nextDouble();
		s.nextLine();
	}
	public void printUsers() {
		System.out.println("Nome    : "+this.nome);
		System.out.println("Sobreome: "+this.sobreNome);
		System.out.println("Idade   : "+this.idade);
		System.out.println("Cargo   : "+this.cargo);
		System.out.println("Salario : "+this.salario);
		System.out.println("ID      : "+this.id);
	}
	public double getSalario() {
		return this.salario;
	}
	
}
