package PractisePrograms;


import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArrayUsingSet {

	public static void main(String[] args) {
		int arr[]= {1,8,5,7,5,1,9,8};
Set<Integer>set=new HashSet<Integer>();
for (int i : arr) {
	
if(set.add(i)==false)
{
	System.out.println(i);
}
}
	}
}




