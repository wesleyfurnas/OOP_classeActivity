import java.util.concurrent.CancellationException;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;
import javax.xml.bind.ParseConversionEvent;

public class Televisao implements ControleRemoto {
	private double tamanho;
	private int canal;
	private int volume;
	private boolean ligada;
	
	public Televisao(double tamanho) {
		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
		this.ligada = false;
	}

	public double getTamanho() {
		return tamanho;
	}

	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
		public void mudarCanal(int canal) throws CanalNaoEncontrado{
			if ((canal <= 0 ) || (canal> 99)) {
			throw new CanalNaoEncontrado(Integer.toString(canal));
			}else {
				setCanal(canal);
			}
		}
		
		
		public void aumentarVolume(int volume) throws EXVInvalid{
			if (((volume )< 0 ) || (getVolume() + volume > 100)) {
				throw new EXVInvalid(volume);
			}else {
				setVolume(volume + getVolume());
			}
		}
		public void diminuirVolume(int volume) throws EXVInvalid{
			if (((-volume + getVolume())< 0 ) || ( volume > 100)) {
				throw new EXVInvalid(volume);
			}else {
				setVolume(volume - getVolume());
			}
		}
		public void ligar() {
			setLigada(true);
		}
		public void desligar() {
			setLigada(false);
		}
		
}
