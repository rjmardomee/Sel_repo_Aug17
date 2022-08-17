package friens.friends;

import java.io.FileNotFoundException;

public class Utility {
	public void doSomething()throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		
		System.out.println("This method will throws exception");
		
	}
	public void checkName(String name) {
		if (name.contains("Ali")) {
			System.out.println("Name contains Ali");	
			}
		else {
			throw new RuntimeException("Name is not contains Ali");
		}
		}
	}


