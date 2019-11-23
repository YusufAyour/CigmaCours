package seance5_1;
import java.lang.reflect.Field;

public class Tomate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class myClass = Shoes.class;
		Field [] tab = myClass.getDeclaredFields();
		for(Field myField:tab) {
			char first = myField.getName().charAt(0);
			boolean correct = Character.isUpperCase(first);
			if(correct) {
				System.out.println("Must be in lower case");
			}
		}
	}

}
