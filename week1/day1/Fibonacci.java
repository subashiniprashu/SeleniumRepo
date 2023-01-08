/**
 * 
 */
package week1.day1;

/**
 * @author Admin
 *
 */
public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int firstNum=0;
			int secondNum=1;
			int sum=0;
			
			System.out.println("The first Number is:"+firstNum);
			for(int i=0;i<=11;i++) {
				sum=firstNum+secondNum;//0+1=1
				firstNum=secondNum;//1
				secondNum=sum;//
				System.out.println("FibonacciSeries"
						+ "::"+sum);
				
			}
		
	}

}
