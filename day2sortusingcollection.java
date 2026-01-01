package Week4assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day2sortusingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Company = {"HCL","WIPRO","ASPIRE systems","CTS"};
		System.out.println(Company);
		//Convert the Array to List
		List <String> list = new
		ArrayList<>(Arrays.asList(Company));
		//Sort the array
		Collections.sort(list);
		//Iterate and print
		System.out.println("Sorted Company Names =");
		for(String Companies :list)
		{
			System.out.println(Companies);
		}
	}

}
