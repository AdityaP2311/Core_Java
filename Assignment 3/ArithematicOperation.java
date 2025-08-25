import java.util.Scanner;

public class ArithematicOperation{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a Expersion: ");
		int a = sc.nextInt();
		char op = sc.next().charAt(0);
		int b = sc.nextInt();
		
		switch(op){
			case '+' -> System.out.println(a + " " + op + " " + b + " = " +(a + b));
			case '-' -> System.out.println(a + " " + op + " " + b + " = " +(a - b));
			case '*' -> System.out.println(a + " " + op + " " + b + " = " +(a * b));
			case '/' -> System.out.println(a + " " + op + " " + b + " = " +(a / b));
			default  -> System.out.println("Invalid Expression !!!!");			
		}
	}
}