import java.util.Scanner;
public class SwapUsingArithematicOp{
	public static void main(String[] args){
		int a,b;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before Swapping (Using + and - ): \nA: "+a+"\nB: "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping (Using + and - ) : \nA: "+a+"\nB: "+b);

		System.out.println("Before Swapping (Using * and / ): \nA: "+a+"\nB: "+b);
		
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println("After Swapping (Using * and / ) : \nA: "+a+"\nB: "+b);		
	}
}
