/*- Write code that asks for two (2) Integers. 
- divides the first by the second 
- Returns the result including the remainder. 
- If either of the numbers is not an Integer, then don't accept the number and ask again. Do not accept zero (0) as a number.
import java.util.Scanner;
*/

public class Remainder {

	public static void main(String[] args) {
	
		System.out.println("Enter 2 values: x, y: ");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println("Your values are " + x + " and " + y);
		
		int z = x % y;
		System.out.println("x % y results in " + z);
				
	}
}
