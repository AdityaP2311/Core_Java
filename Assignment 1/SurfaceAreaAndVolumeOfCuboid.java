import java.util.Scanner;
public class SurfaceAreaAndVolumeOfCuboid{
	public static void main(String[] args){
		float l,h,b;
		double sarea,volume;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length , Breadth and Height of Cuboid: ");
		l = sc.nextFloat();
		b = sc.nextFloat();
		h = sc.nextFloat();

		sarea = 2*(l * b + l * h + b * h);
		volume = l * b * h;

		System.out.println("Surface Area of Cuboid is : "+sarea);
		System.out.println("Volume of Cuboid is "+volume);
	}
}
