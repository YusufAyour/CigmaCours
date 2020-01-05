package classe.introduction.contructor;

public class Directeur {
	int age;
	String nom;
	public Directeur(int age) {
		this.age = age;
	}
	
	public Directeur(int age,String nom) {
		this(age);
		this.nom = nom;
	}
	
	public Directeur(String nom) {
		this(40);
		this.nom = nom;
	}
	
}
