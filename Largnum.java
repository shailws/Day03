package Day03;
import java.util.*;

public class Largnum {
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		double num1 = obj.nextDouble();
		
		System.out.println("Enter second number : ");
		double num2 = obj.nextDouble();
		
		if(num1>num2) {
			System.out.println("First number is large");
		}
		else {
			System.out.println("Second number is large");
		}
	}

}
