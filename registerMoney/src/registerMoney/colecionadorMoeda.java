package registerMoney;

import java.util.Scanner;
public class colecionadorMoeda {
	public static void main(String[] args ){
		Moeda[] arrayMoeda = new Moeda[20];
		Scanner s = new Scanner(System.in);
		
		
		String um = "1";
		int i = 0;
		int ano_fab;
		double valor_origem;
		double valor_dol_american;
		String pais_origem;
		String desc_face_cara;
		String desc_face_coroa;
	     int id_moeda;
	    String decisao;
		for (i = 0; i < 20 ; i++) {
			System.out.println("Quer cadastrar mais 1 moeda: SIM OU NAO ? ");
			decisao = s.nextLine();
			if( decisao.contentEquals("SIM")) {
				System.out.println("Digite o nome do pais de origem: ");
				pais_origem = s.nextLine();
				System.out.println("Digite o valor no pais de origem: ");
				 valor_origem = s.nextDouble();
				 s.nextLine();
				System.out.println("O ano de fabricação: ");
				ano_fab = s.nextInt();
				s.nextLine();
				System.out.println("Digite o valor em dolar americano: ");
			    valor_dol_american = s.nextDouble();
				s.nextLine();
				System.out.println("Descrição da face CARA: ");
				 desc_face_cara = s.nextLine();
				System.out.println("Descrição da face COROA: ");
				 desc_face_coroa = s.nextLine();
				 arrayMoeda[i] = new Moeda(ano_fab, valor_origem, valor_dol_american ,pais_origem, desc_face_cara, desc_face_coroa);
				 arrayMoeda[i].printMoedas();
				System.out.println("Digite 1 para ver o valor convertido em reais. ");
				System.out.println("Digite qualquer TECLA para NÃO VER.");
				//arrayMoeda[i].printMoedas();
				if(um.equals(s.nextLine())) {
					System.out.println("Digite a cotação do dolar: ");
					double cotacao = s.nextDouble();
					s.nextLine();
					System.out.println("valor em reais é: "+ arrayMoeda[i].convert(cotacao));
				}
			}else {
				i = 20;
			}
		}
	}
}
