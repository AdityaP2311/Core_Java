import java.util.Scanner;
public class SwapWithoutUsingTempVariable{
	public static void main(String[] args){
		int a,b;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before Swapping : \nA: "+a+"\nB: "+b);
		
		a = a + b - ( b = a );
		
		System.out.println("After Swapping : \nA: "+a+"\nB: "+b);	
	}
}
