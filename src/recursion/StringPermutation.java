package recursion;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abc";
		permute(str.toCharArray() , 0);
	}

	public static void permute(char[] chars, int start) {

		if (start == chars.length - 1) {
			System.out.println(String.valueOf(chars));
			return;
		}

		for (int i = start; i < chars.length; i++) {
			swap(chars , i , start);
			permute(chars , start + 1);
			swap(chars , i , start);
			

		}
	}

	private static void swap(char[] chars, int i, int j) {
		char c1 = chars[i];
		char c2 = chars[j];

		chars[i] = c2;
		chars[j] = c1;
	}

}
