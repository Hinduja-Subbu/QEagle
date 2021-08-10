package PractisePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionUsingArray {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 6, 7));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 7));


		list1.retainAll(list2);
		System.out.println("Intersection using Array " + list1);

		Set<Integer> list3 = new HashSet<Integer>(Arrays.asList(1, 2, 4, 6, 7));
		Set<Integer> list4 = new HashSet<Integer>(Arrays.asList(1, 3, 4, 5, 7));
		list3.retainAll(list4);
		System.out.println("Intersection using Set " + list3);
	}

}