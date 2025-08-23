import java.util.Scanner;

public class TaxDisplay{
	public static void main(String[] args){
		float bs,tax;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Basic Salary: ");
		bs = sc.nextInt();
		
		if(bs > 300000)
        		tax = 30;
    		else if(bs <= 300000 && bs >= 150000)
        		tax = 20;
    		else
        		tax = 0;
    		System.out.println("Total tax is: "+tax);
	}
}
