package innerClass;

import interFace.Lawyer;
import interFace.Notebook;

public class TestInnerClass {

	public static void main(String[] args) {

		OuterClass oClass = new OuterClass(1.8, 70);
		oClass.printBMI();
		
		//Anonymous class
		Lawyer lawyer = new Lawyer() {
			@Override
			public void 訴訟() {
				System.out.println("訴訟");
			}
		};
		lawyer.訴訟();
		Lawyer lawyer1 = new Lawyer() {
			@Override
			public void 訴訟() {
				System.out.println("訴訟");
			}
		};
		lawyer1.訴訟();
		Notebook nb = new Notebook("auau", 10000, 100) {
			@Override
			public String desc() {
				// TODO Auto-generated method stub
				return "this is a notebook";
			}
		};
		System.out.println(nb.desc());
		
		
	}

}
