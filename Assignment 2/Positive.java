import java.util.Scanner;

public class Positive{
	public static void main(String[] args){
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		n = sc.nextInt();
		
		if(n > 0)
			System.out.println(n+" is Positive Number");
	}
}