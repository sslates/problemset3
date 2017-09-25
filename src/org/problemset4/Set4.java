package org.problemset4;

public class Set4 {
	
	
	public class Singleton {

		/* The class variable instance */
	private static Singleton INSTANCE;
		
		private Singleton() {
		}

		public static Singleton getInstance() {
			if( INSTANCE == null ) {
				INSTANCE = new Singleton();
			}
			return INSTANCE;
		}
		
		Singleton s = Singleton.getInstance();
		
		public static Singleton main(String [] args) {
			
		}

	}



}
