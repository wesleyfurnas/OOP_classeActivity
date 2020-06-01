
public class CanalNaoEncontrado extends Exception {
	private String numero;
	
	public  CanalNaoEncontrado (String numero) {
		super("Canal nao Encontrado: " + numero);
		this.numero = numero;
	}
	public String numeroCanal(){
		
		return numero;
	}
	
	
}
