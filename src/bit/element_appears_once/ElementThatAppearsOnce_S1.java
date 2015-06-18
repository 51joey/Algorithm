package bit.element_appears_once;

/*
 * Q:Given an array where every element occurs 2 times, 
 *   except one element which occurs only once. 
 *   Find the element that occurs once.
 *   
 * S:using xor operation when all the elements appears even times except for one
 *     
 * */
public class ElementThatAppearsOnce_S1 {

	public static void main(String[] args) {
		System.out.println(method1(new int[] { 3, 3, 2, 2, 4 }));

	}

	private static int method1(int[] array) {

		if (array == null) {
			return 0;
		}

		int ret = 0;// return value

		for (int ele : array) {
			ret ^= ele;
		}
		return ret;
	}

}
