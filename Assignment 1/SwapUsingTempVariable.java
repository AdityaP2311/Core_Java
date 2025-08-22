import java.util.Scanner;
public class SwapUsingTempVariable{
	public static void main(String[] args){
		int a,b,temp = 0 ;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any two Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.println("Before Swapping : \nA: "+a+"\nB: "+b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping : \nA: "+a+"\nB: "+b);	
	}
}
