package fondamentaux.classe.java;

public class Salle {
	String num;
	int effectif;
	
	public Salle(String num) {
		this.num = num;
	}
	
	public Salle(int effectif) {
		this("AE564");
		this.effectif = effectif;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.num + " | " + this.effectif;
	}
	
}
