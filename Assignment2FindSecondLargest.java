package Week4assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment2FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array1
		//List <Integer>Array1=List.of(3,2,11,4,6,7);//immutable-cannot add,remove or make changes
		//System.out.println(Array1);
		List <Integer>Array1=new ArrayList<Integer>();
		Array1.add(3);
		Array1.add(2);
		Array1.add(11);
		Array1.add(4);
		Array1.add(6);
		Array1.add(7);

		//Sort the list in ascending order
		Collections.sort(Array1);
		//System.out.println("The sorted numbers are -"+ Array1);
		
		//Get Largest and Second Largest
		int size = Array1.size();
		int largest = Array1.get(size-1);
		int SecondLargest = Array1.get(size-2);
		System.out.println("SortedList ="+ Array1);
		System.out.println("Second Largest Number ="+SecondLargest);
	}

}
