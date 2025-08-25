public class PrintSumOfEvenOdd100To200{
	public static void main(String[] args){
		
		int sum = 0;
		for(int i = 100 ; i <= 200 ; i+=2 )
			sum += i ;	
		System.out.println("Sum of Even Numbers from 100 to 200 is : "+sum);

		int sum2 = 0;
		for(int i = 101 ; i <= 200 ; i+=2 )
			sum2 += i;
		System.out.println("Sum Of Odd Numbers from 100 to 200 are: "+sum2);
	}
}