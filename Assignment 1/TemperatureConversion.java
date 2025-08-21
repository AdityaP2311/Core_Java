import java.util.Scanner;

public class TemperatureConversion{
	public static void main(String []args){
		float fahrenheit;
		double kelvin,celsius;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Temperature in Fahrenheit: ");
		fahrenheit = sc.nextFloat();

		celsius = ((5.0/9.0) * ( fahrenheit - 32 ));
		kelvin = ( celsius + 273.15 );

		System.out.println("Temperature in Celsius is : " + celsius);
		System.out.println("Temperature in Kelvin is : " + kelvin);
	}
}