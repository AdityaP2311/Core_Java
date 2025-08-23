import java.util.Scanner;

public class CompareNumber {
	public static void main(String[] args) {
		int a,b;

		Scanner sc = new Scanner(System.in);

        	System.out.print("Enter first number: ");
        	a = sc.nextInt();
        	System.out.print("Enter second number: ");
        	b = sc.nextInt();

        	if (a == b) 
			System.out.println(a + " == " + b);
        	else if (a > b) 
            		System.out.println(a + " > " + b);
        	else 
            		System.out.println(a + " < " + b);
       }
}
