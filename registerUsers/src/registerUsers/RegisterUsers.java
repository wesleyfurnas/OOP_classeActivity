package registerUsers;
import java.util.Scanner;

public class RegisterUsers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Usuario[] arrayUsuarios = new Usuario[5];
		int i = 0;
		String decisao;
		String um = "1";
		for (i = 0; i < 5 ; i++) {
			System.out.println("Quer cadastrar: SIM OU NAO ? ");
			decisao = s.nextLine();
			if( decisao.contentEquals("SIM")) {
				arrayUsuarios[i] = new Usuario();
				arrayUsuarios[i].register();
				System.out.println("Digite 1 para                  PROMOVER ");
				System.out.println("Digite qualquer coisa para NAO PROMOVER ");
				if(um.equals(s.nextLine())) {
					
					System.out.println("Digite a porcentagem de promocao: ");
					arrayUsuarios[i].promover(s.nextDouble());
					s.nextLine();
				}
				arrayUsuarios[i].printUsers();
			}else {
				i = 6;
			}
		}
	}

}
