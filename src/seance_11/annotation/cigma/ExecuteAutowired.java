package seance_11.annotation.cigma;

import java.lang.reflect.Field;

public class ExecuteAutowired {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class maclasse = DBManager.class;
		Field[] fields = maclasse.getDeclaredFields();
		for (Field field : fields) {
			Autowired auto = field.getAnnotation(Autowired.class);
			if(auto != null) {
				if(auto.value() == Way.SETTER) {
					DBManager maDB = (DBManager)maclasse.newInstance();
					maDB.conn = new Connection();
				}else {
					DBManager maDB = new DBManager(new Connection());
				}
			
			}
			
		}
	}

}
