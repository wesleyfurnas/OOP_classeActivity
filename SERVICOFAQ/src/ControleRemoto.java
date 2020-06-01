
public interface ControleRemoto {
	public void mudarCanal(int canal) throws CanalNaoEncontrado;
	public void aumentarVolume(int valor) throws EXVInvalid;
	public void diminuirVolume(int valor) throws EXVInvalid;
	public void ligar();
	public void desligar();
}
