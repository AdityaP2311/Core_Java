import java.util.Scanner;

public class NumberConversion{
	public static String convertDecimal(int decimal, int base) {
        	String hexChars = "0123456789ABCDEF";
        	String result = "";

        	if (decimal == 0){
            		return "0";
        	}

        	while (decimal > 0){
            		int remainder = decimal % base;
            		result = hexChars.charAt(remainder) + result; 
			decimal = decimal / base;
        	}

        	return result;
    	}
	public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a decimal number: ");
        	int decimal = sc.nextInt();

        	String binary = convertDecimal(decimal, 2);
        	String octal = convertDecimal(decimal, 8);
        	String hex = convertDecimal(decimal, 16);

        	System.out.println("\nBinary Number of  "+decimal+" is "+ binary);
        	System.out.println("Octal Number of  "+decimal+" is "+ octal);
        	System.out.println("Hexadecimal Number of  "+decimal+" is "+ hex);
    	}
}
