
public class Main {
	public static void main(String args[]) {
		Banco b1 = new Banco();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		ContaCorrente corre1 = new ContaCorrente(100.0, 112, 001, 0.03, 0.1);
		ContaPoupanca poup1 = new ContaPoupanca(1000.0, 111 , 000, 0.05);
		
		ContaEspecial esp1 = new ContaEspecial(200.0,222, 222,0.02,100);
		ContaPoupanca poupe2 = new ContaPoupanca(2000.0, 221 , 111, 0.04);
		
		c1.setCorrente(corre1);
		c1.setPoupanca(poup1);
		c1.setNome("Lucas");
		c1.setCPF("2222");
		
		c2.setNome("joao");
		c2.setCPF("11111");
		c2.setPoupanca(poupe2);
		c2.setEspecial(esp1);
		
		
		b1.addClientes(c1);
		b1.addClientes(c2);
		
		System.out.println("Imprimir o saldo de todos os clientes: ");
		for (Cliente cliente : b1.clientes) {
			System.out.println("Nome: "+ cliente.getNome());
			System.out.println("Total:"+ cliente.getTotal());
			System.out.println("------------------------------------------");	
			
		}
		c1.corrente.aplicarJuros();
		c1.poupanca.aplicarJuros();
		c2.especial.aplicarJuros();
		c2.poupanca.aplicarJuros();
		System.out.println("Após render os juros: ");
		for (Cliente cliente : b1.clientes) {
			System.out.println("Nome: "+ cliente.getNome());
			System.out.println("Total:"+ cliente.getTotal());
			System.out.println("------------------------------------------");	
			
		}
		
		if(b1.auditoria()) {
			System.out.println("Passou na auditoria!");
		}
		
	}
}
