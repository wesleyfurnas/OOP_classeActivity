import java.sql.Time;
import java.util.Random;
import java.util.Random;
import java.util.Timer;
public class Figth {
	private Fighter desafiado;
	private Fighter desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void  marcarLuta(){
		if((this.getDesafiado() != this.desafiante) && (this.desafiado.getCategory() == this.getDesafiante().getCategory())){
			this.aprovada = true;
		}
		else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	public void lutar() {
		Random r = new Random();
		if (this.isAprovada()) {
			this.getDesafiado().showFighter();
			this.getDesafiante().showFighter();
			
			switch(r.nextInt(3)) {
				case 0: 
					this.getDesafiado().setVictorys(this.getDesafiado().getVictorys()+1);
					this.getDesafiante().setDefeats(this.getDesafiante().getDefeats()+1);
					System.out.println("                     VENCEDOR : \n");
					this.getDesafiado().showFighter();
					System.out.println("                    PERDEDOR: \n");
					this.getDesafiante().showFighter();
				break;
				case 1:
					this.getDesafiante().setVictorys(this.getDesafiante().getVictorys()+1);
					this.getDesafiado().setDefeats(this.getDesafiado().getDefeats()+1);
					System.out.println("                    VENCEDOR: \n");
					this.getDesafiante().showFighter();
					System.out.println("                    PERDEDOR: \n");
					this.getDesafiado().showFighter();
				break;
				case 2:
					System.out.println("                     EMPATE!  ");
					this.getDesafiado().setTie(this.getDesafiado().getTie()+1);
					this.getDesafiante().setTie(this.getDesafiante().getTie()+1);
			    break;
			    default:
			    break;
			}
	    }else{
	    	System.out.println("LUTA NÃO PODE ACONTECER!");
	    }
    }

	public Fighter getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Fighter desafiado) {
		this.desafiado = desafiado;
	}

	public  Fighter getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Fighter desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
