package org.problemset4;

public class CatSingleton {
	public class Singleton {

		public static void main(String args[]) {
			CatSingleton s = CatSingleton.getInstance();
			CatSingleton t = CatSingleton.getInstance();
			
			s.setName("Tonya");
			t.setName("Nancy");
			
			System.out.println("Tonya = " + s.getName());
			System.out.println("Nancy = " + t.getName());
		}

	}

}
