
public class Main {

	public static void main(String[] args) {
		Poupanca p1 = new Poupanca(100, "Ruan",10.00);
		double valor = 50.00;
		p1.setTaxa(10.00);
		p1.depositar(valor);
		System.out.println("Saldo atual:" + p1.getSaldo());
		p1.render();
		System.out.println("Saldo atual:" + p1.getSaldo());
		
		Fidelidade f1 = new Fidelidade(100, "joao");
		
		f1.setBonus(10);
		System.out.println("Saldo atual:" + f1.getSaldo());
		f1.depositar(600);
		System.out.println("Saldo atual:" + f1.getSaldo());
		

	}

}
