package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		TreeSet<Integer> data = new TreeSet<Integer>(Arrays.asList(3,2,11,4,6,7));
		System.out.println(data);
		
		List<Integer> list = new ArrayList<Integer>(data);
		
		System.out.println("The second Largest Number in the given data is" +list.get(4));

	}

}
