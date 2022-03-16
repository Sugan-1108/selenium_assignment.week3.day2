package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MissingElement {

	public static void main(String[] args) {
		
		TreeSet<Integer> data = new TreeSet<Integer> (Arrays.asList(1,2,3,4,7,6,8));
		System.out.println(data);
		List<Integer> list = new ArrayList<Integer>(data);
		
		for (int i : data) {
			
			if (i+1 != list.get(i))
			{
				System.out.println("Missing element is" + (i+1));
				break;
			}
		}
		
		System.out.println();

	}

}
