package bit.others;

import bit.set_bit_position.LeftMostSetBitPosition;

/*
 * Given a range [m , n] where 0 <= m <= n <=2147483647
 * return the bitwise AND of all numbers in [m , n]
 * 
 * */
public class BitwiseANDofNumbersRange {

	public static void main(String[] args) {

	}

	/*'
	 * implement using leftmost method
	 * run a loop for m and n , in each iteration :
	 * 	get leftmost set bit position of m(l1) and n(l2)
	 * 	when l1 == l2  ,the l1-th position of ret is 1
	 * 	when l1 > l2  , the bit in range (l2,l1] should be 0
	 * 
	 * */
	public int rangeBitwiseAnd1(int m, int n) {
		int ret = 0;
		int l1 = -1;// leftmost set bit position of m
		int l2 = -1;// leftmost set bit position of n

		int min = -1;// min of l1 and l2
		int mask = -1;
		while (m > 0 && n > 0) {
			l1 = LeftMostSetBitPosition.getLeftMostSetBitPosition(m);
			l2 = LeftMostSetBitPosition.getLeftMostSetBitPosition(n);
			if (l1 == -1 || l2 == -1) {
				break;
			}

			min = l1 > l2 ? l2 : l1;
			mask = 1 << min;
			if (l1 == l2) {
				ret ^= mask;
			}
			m &= ~mask;
			n &= ~mask;

		}

		return ret;
	}
	
	/*
	 * the implement is to get the leftmost common part
	 * 0110001
	 * 0110010
	 * 01100  (the left most common part)
	 * 
	 * */
	public int rangeBitwiseAnd2(int m, int n) {
		int i = 0;
		while(m != n){
			m = m >> 1;
			n = n >> 1;
			i++;
		}
	 

		return m<<i;
	}

}
