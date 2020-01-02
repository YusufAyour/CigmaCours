package Joueur;

public class Joueur {
	String nom;
	String cin;
	int age;
	public Joueur(String nom,String cin,int age) {
		this(nom,age);
		this.cin = cin;
	}
	public Joueur(String nom,int age) {
		this.nom = nom;
		this.age = age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nom + " a "+this.age + " ans et le CIN : "+this.cin;
	}
}
