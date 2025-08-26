import java.util.Scanner;

public class NumberPattern4{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N:");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1 ; i<=n ; i++){
			for(int j=1; j<=n ; j++){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}
}