import java.util.Scanner;

public class AreaAndCircumferenceOfCircle{
	public static void main(String[] args){
		float r;
		double area,circumference;

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Radius Of Circle: ");
		r=sc.nextFloat();
	
		area = Math.PI * r * r;
		circumference = 2 * Math.PI * r * r;

		System.out.println("Area Of Circle: " + area);
		System.out.println("Circumference Of Circle: " + circumference);
	}
}