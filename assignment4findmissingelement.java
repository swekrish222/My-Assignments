package Week4assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class assignment4findmissingelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Integer>Array1=new ArrayList<Integer>();
		Array1.add(1);
		Array1.add(2);
		Array1.add(3);
		Array1.add(4);
		Array1.add(10);
		Array1.add(6);
		Array1.add(8);
		System.out.println(Array1);
		//Arranging in ascending order
		Collections.sort(Array1);
		System.out.println(Array1);
		//Curtrent element +1 is not equal to next element
		for (int i=0; i < Array1.size()-1;i++)
		{
		int current = Array1.get(i);
		int next = Array1.get(i+1);
		
		if (next!= current+1) 
		{
			System.out.println("Missing Number is "+ (current+1));
		}
		}
	}

}
