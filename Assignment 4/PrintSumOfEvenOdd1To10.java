public class PrintSumOfEvenOdd1To10{
	public static void main(String[] args){
		
		int sum = 0;
		for(int i = 2 ; i <= 10 ; i+=2 )
			sum += i ;	
		System.out.println("Sum of Even Numbers from 1 to 10 is : "+sum);

		int sum2 = 0;
		for(int i = 1 ; i <= 10 ; i+=2 )
			sum2 += i;
		System.out.println("Sum Of Odd Numbers from 1 to 10 are: "+sum2);
	}
}