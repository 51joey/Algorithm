package bit.opposite_signs;

public class OppositeSigns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oppositeSigns1(1, -4));
		System.out.println(oppositeSigns2(1, -4));
	}

	private static boolean oppositeSigns1(int x, int y){
		boolean b1 = x >= 0 ? true : false;
		boolean b2 = y >= 0 ? true : false ;
		return b1 == b2 ? false : true ;
	}
	private static boolean oppositeSigns2(int x, int y) {
		return (x ^ y) < 0;
	}

}
