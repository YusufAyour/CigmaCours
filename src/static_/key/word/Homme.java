package static_.key.word;

import java.util.Date;

//static : les attributs & les methodes
public class Homme {
	//attribut static est un attribut dont la
	//valeur est partagee par tous les objets
	
	//methode statique est une methode 
	//qui ne manipule pas les attributs d'objets
	
	
	Date DateNaissance;//attribut d'objet
	static int NombreHommes;//attribut de classe
	// l'acces a un attribut de classe se fait par le nom de la classe
	// Homme.NombreHommes
	
	public long getAge() {
		return (new Date()).getTime() - this.DateNaissance.getTime();
		//Methode non statique car elle utilise DateNaissance
	}
	
	public static long CalculerAge(Date date_x) {
		return (new Date()).getTime() - date_x.getTime();
		//methode statique car elle n'utilise aucun attribut d'objets
	}
}
