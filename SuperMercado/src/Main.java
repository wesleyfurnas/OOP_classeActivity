import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {
		ArrayList<Pagaveis> pag = new ArrayList<Pagaveis>();
		ArrayList<NaoMexer> nm = new ArrayList<NaoMexer>();
		
		Pagaveis trabAssal = new TrabalhadorAssalariado("JOAO","SILVA","0721351222",1000.0);

		
		Pagaveis trabAssal2 = new TrabalhadorHorista("LUCAS","ARAUJO","0222223333", 12, 30.0);
		
		
		pag.add(trabAssal2);
		pag.add(trabAssal);
		
		NaoMexer trabaMexer = new TrabalhadorAssalariado("LEO","SILVA","23232351222",1000.0) ;
			
		nm.add(trabaMexer);
		for (Pagaveis pagaveis : pag) {
			System.out.println("Valor : " + pagaveis.getValor());
		}	
	
	for (NaoMexer nms : nm) 
		System.out.println("Valor : " + nms.getName());
	}
}
