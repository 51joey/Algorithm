package bit.set_bit_position;

public class LeftMostSetBitPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getLeftMostSetBitPosition(-6));
	}
	
	
	/*
	 * get the position of the leftmost set bit
	 * position start from 0
	 * if integer equals 0 , return -1 
	 * */
	public static int getLeftMostSetBitPosition(int integer){
		
		int ret = -1 ;
		if(integer < 0){
			return Integer.SIZE -1 ;
		}
		
		while(integer > 0){
			ret++;
			integer = integer >> 1;
		}
		
		return ret ;
		
	}

}
