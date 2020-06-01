package registerMoney;
public class Moeda {
	private int ano_fab;
	private double valor_origem;
	private double valor_dol_american;
	private String pais_origem;
	private String desc_face_cara;
	private String desc_face_coroa;
    private  int id_moeda;
	private int cont = 1;
	public int getAno_fab() {
		return ano_fab;
	}

	public void setAno_fab(int ano_fab) {
		this.ano_fab = ano_fab;
	}

	public double getValor_origem() {
		return valor_origem;
	}

	public void setValor_origem(double valor_origem) {
		this.valor_origem = valor_origem;
	}

	public double getValor_dol_american() {
		return valor_dol_american;
	}

	public void setValor_dol_american(double valor_dol_american) {
		this.valor_dol_american = valor_dol_american;
	}

	public String getPais_origem() {
		return pais_origem;
	}

	public void setPais_origem(String pais_origem) {
		this.pais_origem = pais_origem;
	}

	public String getDesc_face_cara() {
		return desc_face_cara;
	}

	public void setDesc_face_cara(String desc_face_cara) {
		this.desc_face_cara = desc_face_cara;
	}

	public String getDesc_face_coroa() {
		return desc_face_coroa;
	}

	public void setDesc_face_coroa(String desc_face_coroa) {
		this.desc_face_coroa = desc_face_coroa;
	}

	public  int getId_moeda() {
		return id_moeda;
	}

	public Moeda(int fab, double valOrigem, double valAmerican, String pais, String desCara, String desCoroa) {
		setAno_fab(fab);
		setValor_dol_american(valAmerican);
		setValor_origem(valOrigem);
		setPais_origem(pais);
		setDesc_face_cara(desCara);
		setDesc_face_coroa(desCoroa);
		this.id_moeda= cont++;
	}
	
	public double convert(double cotation) {
		
		return cotation*this.valor_dol_american;
	}
	public void printMoedas(){
		System.out.println("Nome  do pais de origem   : "+getPais_origem());
		System.out.println("Valor em dolar americano: "+getValor_dol_american());
		System.out.println("Valor no pais de origem   : "+ getValor_origem());
		System.out.println("Descricao face CARA  : "+getDesc_face_cara());
		System.out.println("Descricao face COROA : "+getDesc_face_coroa());
		System.out.println("Ano de fabricação: "+getAno_fab());
		System.out.println("ID      : "+ getId_moeda());
	}
}
