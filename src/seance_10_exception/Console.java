package seance_10_exception;

import java.io.FileOutputStream;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void div(int a,int b) {
		if(b!=0) {
			save(a/b);
		}
		save(0);
	}
	
	void save(int d) {
		FileOutputStream f = new FileOutputStream("X:/file.txt");
	}

}
