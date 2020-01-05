package seance_10_exception;

import java.io.FileOutputStream;
import java.io.IOException;

public class Console {

	public static FileOutputStream f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 2;
		try {
			div(a,b);
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}finally {
//			try {
//				f.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
	
	public static void div(int a,int b) throws IOException {
		if(b!=0) {
			save(a/b);
		}
		save(0);
	}
	
	public static void save(int d) throws IOException {
		f = new FileOutputStream("X:/file.txt");
	}

}
