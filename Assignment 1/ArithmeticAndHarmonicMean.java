import java.util.Scanner;

public class ArithmeticAndHarmonicMean{
	public static void main(String[] args){
		float a,b;
		double AM,HM;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Two Number: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		AM = (a + b)/2.0;
		HM = (2* a * b)/(a + b);

		System.out.println("Arithematic Mean is :"+AM);
		System.out.println("Harmonic Mean is "+HM);
	}
}