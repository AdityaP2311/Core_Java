import java.util.Scanner;

public class AreaOfRoom{
	public static void main(String[] args){
		double rl,rh,rb,rarea,roofarea,parea;
		double dl,db,darea;
		double wl,wb,warea;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length Breadth and Height of Room(in meters) : ");
		rl = sc.nextDouble();
		rb = sc.nextDouble();
		rh = sc.nextDouble();
		rarea = 2 * (rb + rl) * rh;
	
		System.out.println("Enter Length and Width of Window(in meters) : ");
		wl = sc.nextDouble();
		wb = sc.nextDouble();
		warea = (wl * wb) * 2 ;

		System.out.println("Enter Length and Width of Door(in meters) : ");
		dl = sc.nextDouble();
		db = sc.nextDouble();
		darea = dl * db ;

		parea = rarea - (darea + warea);
		roofarea = rb * rl;

		System.out.println("Area of painted walls  is :"+parea+ " sq.ms");
		System.out.println("Area of whitewashed roof is :"+roofarea+ " sq.ms");
	}
}