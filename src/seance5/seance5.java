package seance5;

import java.lang.reflect.Field;

public class seance5 {

	public static void main(String[] args) {
		Class myClass = Apple.class;
		Field [] tab = myClass.getDeclaredFields();
		for( Field myField : tab) {
			System.out.println(myField.toString());
//			System.out.println();
//			char first = myField.getName
		}
		
	}
}
