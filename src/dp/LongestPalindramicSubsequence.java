package dp;

public class LongestPalindramicSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABCBCA";
		System.out.println(lps1(str.toCharArray(), 0, str.length() - 1));
	}

	
	public static int lps1(char[] array, int start, int end) {

		if (start > end) {
			return 0;
		}
		if (start == end) {
			return 1;
		}

		if (array[start] == array[end]) {

			return lps1(array, start + 1, end - 1) + 2;

		} else {
			return Math.max(lps1(array, start + 1, end),
					lps1(array, start, end - 1));
		}

	}
	
	public static int lps2(char[] array) {

		
		return 0 ;
		
	}

}
