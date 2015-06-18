package bit.math;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.out.println(log2n(3));
	}

	public static int add(int x, int y) {

		while (y != 0) {

			int carry = x & y;// AND gives the carries
			x = x ^ y;// XOR gives the sum without carries
			y = carry << 1;

		}

		return x;
	}

	public static int sub(int x, int y) {

		return add(x, -y);
	}

	public static int abs(int x) {
		int mask = x >> Integer.SIZE - 1;

		return (mask ^ x) - mask; // toggle all the bits , and add 1 to the
									// toggled number
	}

	/*
	 * implement without branching
	 */
	public static int min(int x, int y) {

		int sign = (x - y) >> Integer.SIZE - 1;

		return y ^ ((x ^ y) & sign);
	}

	/*
	 * implement without branching
	 */
	public static int max(int x, int y) {

		int sign = (x - y) >> Integer.SIZE - 1;

		return x ^ ((x ^ y) & sign);
	}
	
	

}
