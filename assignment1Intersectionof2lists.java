package Week4assignment;

import java.util.ArrayList;
import java.util.List;

public class assignment1Intersectionof2lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array1
		List<Integer>Array1=List.of(3,2,11,4,6,7);
		System.out.println(Array1);
		//Array2
		List <Integer>Array2=List.of(1,2,8,4,9,7);
		System.out.println(Array2);
		System.out.println("The Intersection elements are");
		for (int i=0; i < Array1.size();i++)
		{
			int value = Array1.get(i);
			if (Array2.contains(value))
			{
				System.out.println(value);
			}
		
		
		}
		
		
	}

}
