package day2Assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		int FirstNumber=0;
		int SecondNumber=1;
		System.out.println("Fibonnaci Numbers till the range of" + n);
		
		//To calculate the first number
		for(int i=1;i<=n;++i)
		
		{
			int FinalNumber = FirstNumber+SecondNumber;
			FirstNumber=SecondNumber;
			SecondNumber=FinalNumber;
			
		System.out.println(FirstNumber +", ");	
			
		}
		

	}

}
