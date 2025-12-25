package base;

public class demo {

	int i;
//	demo() {
//		i=20;
//	}
	private demo(int a) {
     i=a;
	}
		public static void main(String[] args) {
		//demo d = new demo();
		demo d1 = new demo(30);
		//System.out.println(d.i);
		System.out.println(d1.i);
	}
}
