package assignments.week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		list1.retainAll(list2);
		System.out.println(list1);
		

	}

}
