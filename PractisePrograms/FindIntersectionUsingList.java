package PractisePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		
		//Method1//
		/*ArrayList<Integer>arr1=new ArrayList<Integer>();
		arr1.add(3);
		arr1.add(2);
		arr1.add(11);
		arr1.add(4);
		arr1.add(6);
		arr1.add(7);
		
		ArrayList<Integer>arr2=new ArrayList<Integer>();
		arr2.add(1);
		arr2.add(2);
		arr2.add(8);
		arr2.add(4);
		arr2.add(9);
		arr2.add(7);
	
	arr1.retainAll(arr2);
	System.out.println("Intersection:"+arr1);
	
}

}*/

//Method2
int[] arr1= {3,2,11,4,6,7};
int[] arr2= {1,2,8,4,9,7};
 List<Integer> arrayList=new ArrayList<Integer>();
 
 for(int i=0;i<arr1.length;i++) {
 for(int j=0;j<arr2.length;j++) {
 if(arr1[i]==arr2[j]){
	 arrayList.add(arr2[j]);
 }
 }
 }
 Collections.sort(arrayList);
 System.out.println("Intersection:"+arrayList);
 }
}
