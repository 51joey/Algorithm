package recursion;

/*
 * print from 0 to n digit numbers using recursion
 * 
 * for example : when n == 4 , print from 0 to 9999
 * */
public class NDigitNumberPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {

			sb.append(0);// sb.setCharAt(i, (char) (48 + 0)); error
		}

		permutation(sb, 0);
	}

	public static void permutation(StringBuilder sb, int start) {
		if (sb.length() == start) {
			System.out.println(sb.toString());
			return;
		}

		for (int i = 0; i < 10; i++) {
			sb.setCharAt(start, (char) (48 + i));
			permutation(sb, start + 1);
		}
	}

}
