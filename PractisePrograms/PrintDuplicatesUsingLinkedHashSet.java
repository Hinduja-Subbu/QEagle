package PractisePrograms;


import java.util.LinkedHashSet;

import java.util.Set;

public class PrintDuplicatesUsingLinkedHashSet 
{
	
	public static void main(String[] args) {
		int[] data = {1,3,8,3,11,5,6,4,7,6,7};
		 Set<Integer> duplicates = new LinkedHashSet<Integer>();
		 for(int i=0;i<data.length;i++) {
			 for(int j=0;j<data.length;j++) {
				 if(data[i]==data[j]&& i != j)
				 {
					 duplicates.add(data[i]);
					 System.out.println(duplicates);
				 }
			 }
		 }
	}
}

	


