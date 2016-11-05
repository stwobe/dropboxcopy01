//deriving 'e' or Euler's number. (1+1/n)^n on a spreadsheet

public class MathHell5 {

	public static void main(String[] args) {
		
		for (double d = 0; d <= 1000; d++) {
			
			System.out.println(" ");
			
			System.out.println(Math.pow((1+1/d),d));
			
		}
		
	}
}
			
//pow(double a, double b)
//Returns the value of the first argument raised to the power of the second argument.
//http://docs.oracle.com/javase/7/docs/api/index.html?overview-summary.html
