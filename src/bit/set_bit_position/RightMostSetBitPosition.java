package bit.set_bit_position;

public class RightMostSetBitPosition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getRightMostSetBitPosition(127));
	}

	/*
	 * get the position of the rightmost set bit position start from 0 if
	 * integer equals 0 , return -1
	 */
	public static int getRightMostSetBitPosition(int integer) {

		if (integer < 0) {
			return Integer.SIZE - 1;
		}

		int i = integer & (integer - 1);// erase the right most set bit
		i = integer ^ i;// get a number only contains one set bit

		int ret = 0;

		while (i > 0) {

			i = i >> 1;
			ret++;
		}

		return ret;
	}
}
