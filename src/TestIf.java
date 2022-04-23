
public class TestIf {

	public static void main(String[] args) {

		int age = 35;

		if (age >= 18) {
			System.out.println("成年");
			if (age >= 30) {
				System.out.println("壯年");// alt + up or down
			}
		} else {
			System.out.println("未成年");
		}
		// format: ctrl+shift+f
		char classroom = 'A';
		switch (classroom) {
			case 'A':
			case 'B':// if classroom == 204
				System.out.println("人數大於等於30");
				break; //ctrl + /
			case 'C':// else if classroom == 305
				System.out.println("人數小於30,大於等於20");
				break;
			default:// else
				System.out.println("其它情況");
				break;
		}
	}

}







