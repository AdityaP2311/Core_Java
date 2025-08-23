import java.util.Scanner;

public class  ItemsDiscountCalculate{
	public static void main(String[] args){
		int q1,q2,q3,r1,r2,r3;
    		float tsale;
    		double dis;

		Scanner sc = new Scanner(System.in);

    		System.out.println("Enter Quantity for 1st Item:- ");
    		q1 = sc.nextInt();
    		System.out.println("Enter Rate for 1st Item:- ");
    		r1 = sc.nextInt();
    		System.out.println("Enter Quantity for 2nd Item:- ");
    		q2 = sc.nextInt();
    		System.out.println("Enter Rate for 2nd Item:- ");
    		r2 = sc.nextInt();
    		System.out.println("Enter Quantity for 3rd Item:- ");
    		q3 = sc.nextInt();
    		System.out.println("Enter Rate for 3rd Item:- ");
    		r3 = sc.nextInt();


    		tsale=(q1 * r1) + (q2 * r2) + (q3 * r3);

    		System.out.println("Total Sale= "+tsale);
		
		if(tsale >= 1000 && tsale <= 3000){
        		dis = tsale * (0.2);
        		System.out.println("Total Discount= "+dis);
    		}
    		else if(tsale >= 3000 && tsale > 5000){
        		dis = tsale * (0.15);
        		System.out.println("Total Discount= "+dis);
    		}
    		else if(tsale >= 5000 && tsale >= 10000){
        		dis= tsale * (0.08);
        		System.out.println("Total Discount= "+dis);
    		}
    		else
    			System.out.println("You are Not Eligible for Discount!!!!");
	}
}
