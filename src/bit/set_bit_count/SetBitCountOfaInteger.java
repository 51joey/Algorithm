package bit.set_bit_count;

public class SetBitCountOfaInteger {

	public static void main(String[] args) {

		System.out.println(riskSolution(6));

	}

	/*
	 * if integer is positive , the while loop will never end
	 * */
	public static int riskSolution(int integer) {
		int ret = 0;

		while (integer != 0) {
		  if((integer & 1) !=0){
			  ret++;
		  }	

		  integer = integer >> 1;
		}

		return ret;
	}
	public static int getSetBitCount1(int integer) {
		int ret = 0;
		int flag = 1;
		while (flag != 0) {
			if ((flag & integer) != 0) {
				ret++;
			}
			flag = flag << 1;

		}

		return ret;
	}

	public static int getSetBitCount2(int integer) {
		int ret = 0;

		while (integer != 0) {
			integer &= integer - 1;// turn off the rightmost set bit
			ret++;
		}

		return ret;
	}

}
