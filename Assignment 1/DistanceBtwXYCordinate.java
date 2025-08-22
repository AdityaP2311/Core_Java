import java.util.Scanner;

public class DistanceBtwXYCordinate{
	public static void main(String[] args){
		float x1,x2,y1,y2;
		double distance; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter X1 and Y1 Corodinate of Points :");
		x1 = sc.nextFloat();
		y1 = sc.nextFloat();
		System.out.println("Enter X2 and Y2 Corodinate of Points :");
		x2 = sc.nextFloat();
		y2 = sc.nextFloat();

		distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

		System.out.println("Distance Between Two Points :"+distance);
	}
}

// distance=sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
