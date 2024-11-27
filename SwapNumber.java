package swapping;
import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a,b;
		//Get two numbers from the user
		System.out.println("Enter the first number : ");
		a=sc.nextInt();
		System.out.println("Enter the secound number : ");
		b=sc.nextInt();
		//swap the number
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping :a="+a+",b="+b);
		

	}

}
