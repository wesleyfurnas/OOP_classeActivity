package aulaHerancaVeiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Estacionamento {
  ArrayList<Veiculo> v1 = new ArrayList<Veiculo>();
  public void add_Veiculo(Veiculo v) {
	  v1.add(v);
  }
  public void rm_Veiculo(String id) {
	  for (Veiculo veiculo : v1) {
		if(veiculo.getId_veiculo().equals(id)) {
			v1.remove(veiculo);
			System.out.println(veiculo.getId_veiculo() +"Removido !");
			return;
		}
	}
	System.out.println(id + "Nao está estacionado.");
	return;
  }
}
