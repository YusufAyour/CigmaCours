package seance5_1;

import java.lang.reflect.Constructor;
import java.util.ResourceBundle;

public class Vehicule {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ResourceBundle r = ResourceBundle.getBundle("seance5_1.config");
		String className = r.getString("key");
		Class myClass = Class.forName(className);
		Constructor [] tab = myClass.getDeclaredConstructors();
		Constructor con = tab[0];
		con.setAccessible(true);
		Mother Maman = (Mother)con.newInstance(null);
		System.out.println(Maman.toString());
	}

}
