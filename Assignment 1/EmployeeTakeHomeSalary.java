import java.util.Scanner;

public class  EmployeeTakeHomeSalary{
	public static void main(String [] args){
		
		int id;
		double da = 30.0 ,hra = 10.0 ,tax = 5.0,basicSal,totalSal,takeHome;
		
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter ID: ");
		id = sc.nextInt();
		System.out.println("Enter Basic Salary: ");
		basicSal = sc.nextDouble();

		totalSal = basicSal+((basicSal*(da+hra))/100);
		takeHome = totalSal - (totalSal * tax )/100;

		System.out.println("Take Home Salary of an Employee is : "+takeHome);
	}
}

