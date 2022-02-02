
public class Operator {
	public static void main(String[] args) {
		//		int a = 15;
		//		int c;
		//
		//		c = a + 3; // c = 18
		//		System.out.println(c);
		//
		//		c = a - 5; // c = 10
		//		System.out.println(c);
		//
		//		c = a * 2; // c = 20
		//		System.out.println(c);
		//
		//		c = a / 6; // c = 2
		//		System.out.println(c);
		//
		//		c = a % 4; // c = 3
		//		System.out.println(c);

		//		int a;
		//		int c;
		//
		//		a = 5;
		//		c = ++a; // a をインクリメントした後に、a が c に代入される
		//		System.out.println(a);
		//		System.out.println(c);
		//		// それぞれの値は、a が「6」で c も「6」
		//
		//		a = 5;
		//		c = a++; // a を c に代入した後に、a がインクリメントされる
		//		System.out.println(a);
		//		System.out.println(c);
		//		// それぞれの値は、a が「6」で c が「5」

		int a;

		a = 10; // a = 10：aに10を代入
		System.out.println(a);

		a += 5; // a = 15：aにa+5の結果を代入
		System.out.println(a);

		a -= 3; // a = 12：aにa-3の結果を代入
		System.out.println(a);

		a *= 4; // a = 48：aにa*4の結果を代入
		System.out.println(a);

		a /= 2; // a = 24：aにa/2の結果を代入
		System.out.println(a);

		a %= 7; // a = 3 ：aにa%7の結果を代入
		System.out.println(a);
	}
}
