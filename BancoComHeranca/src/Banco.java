import java.util.ArrayList;

public class Banco {
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void addClientes(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public boolean auditoria() {
		double total = 0;
		for (Cliente cliente : clientes) {
			total= total+cliente.getTotal();
		}
		if(total > 500) {
			return true;
		}
		else {
			return false;
		}
	}
}

