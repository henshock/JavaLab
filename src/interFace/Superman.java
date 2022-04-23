package interFace;
//型態: Superman, Lawyer, Accountant
public class Superman implements Lawyer,Accountant {
	
	public void 訴訟() {
		
	}
	
	@Override
	public void tax() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		Accountant s = new Superman();
		//s.訴訟();
		s.tax();
		
	}


	
}
