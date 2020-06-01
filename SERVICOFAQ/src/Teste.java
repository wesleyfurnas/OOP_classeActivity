
public class Teste {
		public static void main(String args[]) {
			 ControleRemoto tv = new Televisao(50);
			 
			 try {
				 tv.aumentarVolume(100);
				 tv.aumentarVolume(1);
				 tv.diminuirVolume(30);
				 tv.mudarCanal(100);
			 }catch(EXVInvalid vi) {
				 System.out.println(vi.getMessage());
			 }catch( CanalNaoEncontrado cn) {
				 System.out.println(cn.getMessage());
			 }finally {
				 System.out.println("Deu certo");
			 }
			 
		}
}
