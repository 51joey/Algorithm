package bit.set_bit_count;

import bit.set_bit_position.LeftMostSetBitPosition;

public class SetBitCountFromOnetoN {

	public static void main(String[] args) {

		System.out.println(bitSetCount(6));
	}

	public static int bitSetCount(int integer) {

		int ret = 0;

		int pos = LeftMostSetBitPosition.getLeftMostSetBitPosition(integer);

		if (pos == -1) {
			return ret;
		}

		int part1 = pos * (int) Math.pow(2, pos - 1);
		int part2 = (integer - ((int) Math.pow(2, pos) - 1));
		int part3 = bitSetCount(integer & (~(1 << pos)));

		ret = part1 + part2 + part3;

		return ret;
	}
}
