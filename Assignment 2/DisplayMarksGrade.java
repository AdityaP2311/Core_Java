import java.util.Scanner;
public class DisplayMarksGrade{
	public static void main(String[] args){
		float s1,s2,s3,total,avg;

		Scanner sc = new Scanner(System.in);

    		System.out.println("Subject 1 Mark: ");
    		s1 = sc.nextInt();
    		System.out.println("Subject 2 Mark: ");
    		s2 = sc.nextInt();
		System.out.println("Subject 3 Mark: ");
    		s3 = sc.nextInt();


    		total = s1 + s2 + s3;
    		avg = total / 3;

    		if(avg >= 75)
        		System.out.println("Secured:- Class I");
    		else if(avg < 75 && avg >= 60)
        		System.out.println("Secured:- Class II");
    		else if(avg < 60 && avg >= 35)
        		System.out.println("Secured:- Class III");
    		else
        		System.out.println("Fail");
	}
}
