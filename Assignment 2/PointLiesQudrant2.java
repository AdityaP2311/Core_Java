import java.util.Scanner;

public class PointLiesQudrant2{
	public static void main(String[] args){
		int x,y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X and Y Co-ordinates of a point: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x == 0 && y == 0)
			System.out.println("Point Lies at the Origin");
		else if(x == 0 )
			System.out.println("Point Lies on Y-Axis");
		else if(y == 0 )
			System.out.println("Point Lies on X-Axis");
		else
			System.out.println("Quadrant: " + ((x > 0) ? (y > 0 ? "I" : "IV") : (y > 0 ? "II" : "III")));
	}
}
