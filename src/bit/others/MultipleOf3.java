package bit.others;

public class MultipleOf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multipleOf3_v2(-123));
	}

	public static boolean multipleOf3_v1(int x) {
		int sum = 0;

		while (x != 0) {
			sum += x % 10;
			x = x / 10;
		}

		return sum % 3 == 0 ? true : false;
	}

	public static boolean multipleOf3_v2(int x) {
		int oddSum = 0;
		int evenSum = 0;
		x = Math.abs(x);// avoid stack overflow in recursion when x < 0
		if (x == 0) {
			return true;
		}
		if (x == 1) {
			return false;
		}
		while (x > 0) {
			if ((x & 1) == 1) {
				oddSum++;
			}
			x = x >> 1;
			
			if ((x & 1) == 1) {
				evenSum++;
			}
			x = x >> 1;
		}
		return multipleOf3_v2(oddSum - evenSum);

	}

}
