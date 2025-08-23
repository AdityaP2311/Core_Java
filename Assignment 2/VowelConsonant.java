import java.util.Scanner;

public class VowelConsonant{
	public static void main(String[] args){
		char ch;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any Lowercase Character: ");
		ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u')
			System.out.println(ch+" is a Vowel");
		else 
			System.out.println(ch+" is a Consonant !!!!");
	}
}