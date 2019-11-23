package seance5_1;

public class Shoes extends Mother {
	String Url = "Mysql";
	int port;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Shoes m = (Shoes)obj;
//		return super.equals(obj);
		return this.Url.equals(m.Url);
	}
}
