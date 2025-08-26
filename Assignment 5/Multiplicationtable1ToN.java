import java.util.Scanner;

public class Multiplicationtable1ToN{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Start: ");
		int s = sc.nextInt();
		System.out.println("Enter End: ");
		int e = sc.nextInt();
		
		for(int i=1 ; i<=10; i++){
			for(int j=s ;j<=e; j++)
				System.out.print(j+" X "+i+" = "+(j*i)+"\t");
			System.out.println();
		}
	}
}
