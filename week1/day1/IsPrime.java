/**
 * 
 */
package week1.day1;

/**
 * @author Admin
 *
 */
public class IsPrime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime Numbers::");
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				
				System.out.print(i+" ");
			}
			/*
			 * else { System.out.print("The non-prime numbers are :"+i); }
			 */
		}
	}

}
