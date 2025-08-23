import java.util.Scanner;

public class TriangleValidOrNot{
	public static void main(String[] args){
		int s1,s2,s3;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Three Sides of triangle : ");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		
		if((s1+s2) > s3 && (s1+s3) > s2 && (s2+s3) > s1)
			System.out.println("Valid Triangle");
		else 
			System.out.println("Invalid Triangle !!!!");
	}
}
