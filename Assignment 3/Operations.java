import java.util.Scanner;

public class Operations{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Equality\n2.Less Than\n3.Quotient and Reminder\n4.Range\n5.Swap\nEnter a Choice: ");
		int ch = sc.nextInt();
		int X=0,Y=0, Z=0;
		if(ch <= 5){
			System.out.println("Enter Value of X and Y : ");
			X = sc.nextInt();
			Y = sc.nextInt();
			
		}
		if(ch == 4){
			System.out.println("Enter Value of Z : ");
			Z = sc.nextInt();
		}

		switch(ch)
    		{
        		case 1: if(X == Y)
                			System.out.println(X+" is Equlas to "+Y);
                		else
                			System.out.println(X+ " is not Equlas to "+Y);
                		break;
        		case 2: if(X < Y)
                			System.out.println(X+" is less than "+Y);
                		else
                			System.out.println(X+" is not less than "+Y);
                		break;
        		case 3: System.out.println("Quotient = "+(X / Y));
                		System.out.println("Remainder= "+(X % Y));
                		break;
        		case 4: if(Z >= X && Z <= Y)
                			System.out.println(Z+" lies between "+X+ " & "+Y);
				else
                			System.out.println(Z+" is not lies between "+X+ " & "+Y);
                		break;
        		case 5: System.out.println("Before Swapping\n X="+X+"\n Y="+Y);
                		X = X + Y;
                		Y = X - Y;
                		X = X - Y;
               			System.out.println("After Swapping\n X="+X+"\n Y="+Y);
               			break;
        		default:System.out.println("Invalid Choice!!!!!!!");
		}
	}
}
		
