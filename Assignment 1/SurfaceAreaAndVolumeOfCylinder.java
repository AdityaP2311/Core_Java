import java.util.Scanner;

public class SurfaceAreaAndVolumeOfCylinder{
	public static void main(String []args){
		float r , h;
		double sarea , volume;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius of Cylinder: ");
		r = sc.nextFloat();
		System.out.println("Enter Height of Cylinder: ");
		h = sc.nextFloat();

		sarea = (2 * Math.PI * r * r) + (2 * Math.PI * r * h);
		volume = Math.PI * r * r * h;

		System.out.println("Surface Area Of Cylinder: " + sarea);
		System.out.println("Volume Of Cylinder: " + volume);
	}
}