public class lutadorMain {
	public static void main(String args[]) {
		Fighter[] f = new Fighter[10];
		f[0] = new Fighter("João", "Brazil", 33, 1.70, 60, 11, 3, 4);
		f[1] = new Fighter("Carlos", "Brazil", 31, 1.65, 66, 10, 1, 0);
		
		Figth l1 = new Figth();
		l1.setDesafiado(f[0]);
		l1.setDesafiante(f[1]);
		l1.marcarLuta();
		l1.lutar();
	}
}
