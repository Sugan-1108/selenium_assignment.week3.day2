package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>(Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20));
		
		Collections.sort(data);
		Set<Integer> findDuplicate = new TreeSet<Integer>();
		
		for (int i : data) {
			
			if(!findDuplicate.add(i))
			{

				System.out.println(i);
				
			}
			
			 
		}

	}

}
