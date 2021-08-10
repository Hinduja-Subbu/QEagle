package PractisePrograms;

import java.util.Collections;
import java.util.LinkedList;

public class SortInLinkedList {

	public static void main(String[] args) {
		LinkedList<String>list=new LinkedList<String>();
		list.add("Hari");
		list.add("Vidhya");
		list.add("Divya");
		list.add("Naveen");
		list.add("Sheriba");
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}

	}

}
