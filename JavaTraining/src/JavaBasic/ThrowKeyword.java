package JavaBasic;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		
		System.out.println("ABC");
		
		try {
			throw new Exception("dinesh Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PQR");

		String Exec_flag="N"; 
		
		if(Exec_flag.equals("N")) {
			
			try {
				throw new Exception("Exce Flag is Blank Exception");	
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

}