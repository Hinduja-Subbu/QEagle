package PractisePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindIntersectionUsingSet {

	public static void main(String[] args) {
		ArrayList<Integer>arr1=new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		ArrayList<Integer>arr2=new ArrayList<Integer>(Arrays.asList(1,2,8,4,9,7));
		
		HashSet <Integer> set1 = new HashSet <Integer>(arr1);
		HashSet <Integer> set2 = new HashSet <Integer>(arr2);
		set1.retainAll(set2);
		System.out.println(set1);
	}

}
