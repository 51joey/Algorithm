package bit.others;

public class MultiplyaGivenInteger {

	public static void main(String[] args) {

		System.out.println(multiWith7(3));
	}

	/*
	 * return x * 3.5 Ignore the digits after decimal point
	 */
	public static int multiWith3p5(int x) {

		// x * 3.5 = x *( 2 + 1 + 0.5)
		return x + (x >> 1) + (x << 1);
	}
	/*
	 * return x * 7 
	 */
	public static int multiWith7(int x) {

		// x * 7 = x *( 2 + 1 + 4)
		return x + (x << 1) + (x << 2);
		/*another way
		  x * 7 = x * ( 8 - 1 )
		  return x << 3 - x;
		 * */

	}

}
