import java.util.Scanner;
public class Principal {
	public static void  main(String[] args) {
		Carro c1 = new Carro("A","UNO", 100);
		Carro c2 = new Carro("B", "TORO",120);
		RegistroAluguel A1 = new RegistroAluguel();
		Double qtdDias = 0.0;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a placa do carro quer alugar: ");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		switch(s.nextLine()){
			case("A"):
				System.out.println("Você escolheu: ");
			    System.out.println(c1.toString());
			    System.out.println("Digite a qtd de dias que deseja alugar: ");
			    qtdDias = s.nextDouble();
			    s.nextLine();
			    System.out.println("O valor do aluguel será de: " + qtdDias*c1.getValorDiaria());
			    System.out.println("Deseja finalizar o aluguel? ");
			    System.out.println("Digite 1 caso SIM e  2 caso NÃO: ");
			    if(s.nextLine().equals("1")) {
			    	A1.setCarroAlugado(c1);
			    	A1.setValorAluguel(c1.getValorDiaria()*qtdDias);
			    	System.out.println("Aluguel realizado com sucesso!");
			    	System.out.println(A1.paraString());
			    }
			break;
			case("B"):
			System.out.println("Você escolheu: ");
			System.out.println(c2.toString());
		    System.out.println("Digite a qtd que quer alugar: ");
		    qtdDias = s.nextDouble();
		    s.nextLine();
		    System.out.println("O valor do aluguel será de: " + qtdDias*c2.getValorDiaria());
		    System.out.println("Deseja finalizar o aluguel? ");
		    System.out.println("Digite 1 caso SIM e  2 caso NÃO: ");
		    if(s.nextLine().equals("1")) {
		    	A1.setCarroAlugado(c2);
		    	A1.setValorAluguel(c2.getValorDiaria()*qtdDias);
		    	System.out.println("Aluguel realizado com sucesso!");
		    	System.out.println(A1.paraString());
		    }
			break;
			default:
				System.out.println("Placa inextente!");
			break;
		}
	    Repositorio r1 = new Repositorio();
	    if(r1.obterCarro(c1.getPlaca()) != null) {
	    	System.out.println("Carro Encontrado!");
	    	System.out.println(r1.obterCarro(c1.getPlaca()).toString());
	    }
	    else {
	    	System.out.println("NÃO ENCONTRADO !");
	    }
	    System.out.println(r1.toString());
	    
	}
}
