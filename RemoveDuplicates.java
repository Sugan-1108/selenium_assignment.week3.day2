package assignments.week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week2";
		String[] splitText = text.split(" ");
		
		LinkedHashSet<String> set1 = new LinkedHashSet<String>(Arrays.asList(splitText));
		
		for(String removeduplicate : set1) 
		{
			System.out.println(removeduplicate);
		}
		
		

	}

}
