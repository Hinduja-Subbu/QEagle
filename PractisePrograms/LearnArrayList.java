package PractisePrograms;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Java");
	
		list.add("Python");
		list.add("Ruby");
		list.add("javascript");
		list.add("R");
		System.out.println("Print arraylist:"+list);
	
	
list.remove(2);
list.remove(3);
System.out.println("Removed list:"+list);
}
}
