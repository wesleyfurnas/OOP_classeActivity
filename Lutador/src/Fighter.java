public class Fighter {
	private String name;
	private String nacionality;
	private int age;
	private double heigth;
	private double weight;
	private int victorys;
	private int defeats;
	private int tie;
	private String category;
		
	public Fighter(String name, String nacionality, int age, double heigth, double weight, int victory, int defeats, int tie){
			this.name = name;
			this.age =age;
			this.nacionality = nacionality;
			this.heigth = heigth;
			setWeight(weight);
			this.victorys= victory;
			this.defeats = defeats;
			this.tie = tie;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNacionality() {
		return nacionality;
	}
	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeigth() {
		return heigth;
	}
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight2) {
		this.weight = weight2;
		if (getWeight() < 70) {
			setCategory("Pena");
		}else if(getWeight() <= 80){
			setCategory("Médio");
		}else {
			setCategory("Pesado");
		}
	}
	public int getVictorys() {
		return victorys;
	}
	public void setVictorys(int victorys) {
		this.victorys = victorys;
	}
	public int getDefeats() {
		return defeats;
	}
	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	public int getTie() {
		return tie;
	}
	public void setTie(int tie) {
		this.tie = tie;
	}
	
	public void showFighter() {
		System.out.println("######################################################");
		System.out.println("Name: "+this.name);
		System.out.println("Nacionality: "+this.nacionality);
		System.out.println("Age: "+this.age);
		System.out.println("Heigth: "+this.heigth);
		System.out.println("Weight: "+this.weight);
		System.out.println("Victorys: "+this.victorys);
		System.out.println("Defeats: "+this.defeats);
		System.out.println("Tie: "+this.tie);
		System.out.println("######################################################");
	}
	
	public void winFight() {
		setVictorys(getVictorys()+1);
	}
	public void loseFight() {
		setDefeats(getDefeats() + 1);
	}
	public void to_tie() {
		setTie(getTie()+1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
