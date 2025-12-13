package day2Assignment;

public class isPrime {

	public static void main(String[] args) {
	
	int num = 5;
	
	if (num <=1)
	{
		System.out.println("This number is not a prime number");
		return;
	}
		boolean isPrime = true;
		
	for (int i=2;i<=num/2 ; i++)
	
		{
		if (num % i == 0)
		
		{ 
			isPrime = false;
			break;
		}
		
		}
	if (isPrime)
		{
		System.out.println(num +" "+ "This is a prime number");	
		}
		
		else
			{
			System.out.println(num +" "+ "Not a Prime number");
		
		
	
	}
		
	
	
}
	}