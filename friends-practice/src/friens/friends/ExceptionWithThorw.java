package friens.friends;

public class ExceptionWithThorw {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		utility.checkName("Ali");
		
		
		
		try {
		utility.checkName("Wali");
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			
		}
		
	}
	
}
