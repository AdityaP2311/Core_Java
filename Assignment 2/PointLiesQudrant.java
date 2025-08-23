import java.util.Scanner;

public class PointLiesQudrant{
	public static void main(String[] args){
		int x,y;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter X and Y Co-ordinates of a point: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x == 0 && y == 0)
			System.out.println("Point Lies at the Origin");
		else if(x > 0 && y > 0 )
			System.out.println("Point Lies in the Qudrant - I");
		else if(x < 0 && y > 0 )
			System.out.println("Point Lies in the Qudrant - II");
		else if(x > 0 && y < 0 )
			System.out.println("Point Lies in the Qudrant - III");
		else if(x < 0 && y < 0 )
			System.out.println("Point Lies in the Qudrant - IV");
		else if(x == 0 )
			System.out.println("Point Lies on Y-Axis");
		else 
			System.out.println("Point Lies on X-Axis");
	}
}
