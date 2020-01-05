package classe.introduction.contructor;

public class Ecole {
	String nom;
	Directeur dir;
	Ecole(Directeur dir){
		this.dir = dir;
	}
	
	Ecole(String nom){
		this(new Directeur("Ahmed"));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nom + " | " + this.dir.nom + " | " + this.dir.age;
	}
}//fin classe ecole

// Constructeurs : des methodes speciales qui 
// prennent le meme nom que la classe
// et qui permet d'instancier un objet
// ====================
// Classe : composant abstrait constitue des attributs et des methodes
// dont le but est de creer des objets 
// ====================
// Objet est un composant concret issu de l'affectation 
// des valeurs aux attributs d'une classe
// ====================
// this. permet d'appeller une attribut ou une methode 
// dans la meme classe
// ====================
// this() permet d'appeller un constructeur dans la meme classe

