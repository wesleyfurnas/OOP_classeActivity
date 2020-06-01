
public class EXVInvalid extends Exception {
	private int volume;
	
	public EXVInvalid(int volume) {
		super("Volume invalido: " + volume);
		this.volume = volume;
	}
	public int getVolume() {
		return volume;
	}
}
