package Day03;
import java.util.*;

public class Checknum {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double num = obj.nextDouble();
		
		if(num>=0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
	}

}
