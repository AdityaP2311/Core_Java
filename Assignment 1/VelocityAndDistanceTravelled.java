import java.util.Scanner;

public class VelocityAndDistanceTravelled{
	public static void main(String []args){
		int invelocity,accelration,time,fvelocity;
		double disttravel;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Initial Velocity: ");
		invelocity = sc.nextInt();
		System.out.println("Enter the Accelration : ");
		accelration = sc.nextInt();
		System.out.println("Enter Time : ");
		time = sc.nextInt();

		
		fvelocity = invelocity + ( accelration * time );
		disttravel = ( invelocity * time ) + ( 0.5 * accelration * time * time );

		System.out.println("Final Velocity is  : " + fvelocity);
		System.out.println("Distance Travelled is : " + disttravel);
	}
}