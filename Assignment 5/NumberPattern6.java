import java.util.Scanner;

public class NumberPattern6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a N:");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1 ; i<=n ; i++){
			for(int j=i ; j<=n ; j++){
            			System.out.print(j+" ");
			}

        		for(int j=i-1 ; j>=1 ; j--){
            			System.out.print(j+" ");
        		}
			System.out.println();
		}
	}
}