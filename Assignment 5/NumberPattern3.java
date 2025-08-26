import java.util.Scanner;

public class NumberPattern3{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N:");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1 ; i<=n ; i++){
			for(int j=1; j<=n ; j++){
				if(i == 1 || i == n || j == 1 || j == n)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");	
			}
			System.out.println();
		}
	}
}