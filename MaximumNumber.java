package MaxNumber;
import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		
		int c,d,big;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the c value");
		c=scanner.nextInt();
		System.out.println("Enter the d valuer");
		d=scanner.nextInt();
		//using ternary operator to find the maximum 
		big=c<d?c:d;
		System.out.println("The maximum number is :"+big);
		

	}

}
