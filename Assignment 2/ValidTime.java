import java.util.Scanner;

public class ValidTime{
	public static void main(String[] args){
		int hr,mi,sec;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Hours: ");
		hr = sc.nextInt();
		System.out.println("Enter Minutes: ");
		mi = sc.nextInt();
		System.out.println("Enter Seconds: ");
		sec = sc.nextInt();

		if(hr > 0 && hr < 24){        
			if(mi > 0 && mi < 60){
				if(sec > 0 && sec < 60){
                			System.out.println("Time is Valid");
            			}
            			else
                			System.out.println("Seconds are Invalid !!!!!");
        		}
        		else
            			System.out.println("Minutes are Invalid !!!!!");
    		}
    		else
        		System.out.println("Hours are Invalid !!!!");		
	}
}