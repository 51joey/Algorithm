package bit.element_appears_once;

/*
 * Q:Given an array where every element occurs three times, 
 *   except one element which occurs only once. 
 *   Find the element that occurs once.
 *   
 * S:calculate the sum of bits at each position from all the elements 
 *   calculate sum%3 for each position , the result is the bit of the element that appears only once .
 *   
 *   1101(13)
 *   1101(13)
 *   1101(13)
 *   1011(11)
 *   4314(sum at each position)
 *   1011(sum%3 at each position , and 1011 is the element that we want)
 *   
 * */
public class ElementThatAppearsOnce_S3 {

	public static void main(String[] args) {
		System.out.println(method2(new int[] { 3, 3, 2, 3 }));

	}

	private static int method1(int[] array) {

		int ret = 0;// return value

		for (int i = 0; i < Integer.SIZE; i++) {
			int bit = 0;// bit for each position in ret ;
			int sum = 0;// sum of bits at each position from all the element

			for (int ele : array) {
				bit = (ele >> i) & 1;
				sum += bit;
			}

			bit = sum % 3;
			ret = ret | (bit << i);

		}

		return ret;
	}

	private static int method2(int[] array) {

		int once = 0;
		int twice = 0;
		int third = 0;

		for (int ele : array) {

			twice ^= once & ele;// find the bit positions that have appeared
								// twice
			once ^= ele;// find the bit positions that have appeared only once
			third = (once & twice);// get the bit positions that have appeared
									// third times
			twice &= ~third;
			once &= ~third;
		}

		return once;

	}

}
