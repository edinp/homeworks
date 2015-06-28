package ba.bitcamp.homework04.task05;

public class Task05 {

	public static void main(String[] args) {

		System.out.println(getPower(-2,-2));
		
	}
	
	/**
	 * Recursive method for calculating the power of base number
	 * @param a - base number
	 * @param b - power, or exponent
	 */
	public static double getPower(double a, double b) {
		if(b==2) {
			return a*a;
		}
		if(b==1) {
			return a;
		}
		if(b==0) {
			return 1;
		}
		if(b<0) {
			return 1/a*getPower(a,b+1);
		}
		return a*getPower(a, b-1);
	}
}