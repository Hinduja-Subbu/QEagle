package PractisePrograms;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,7,6,8 };

		Arrays.sort(arr);
		
		for (int i = 0; i <= arr.length-1; i++) {
			//System.out.println(arr[i]);
			int j=i+1;
			//System.out.println("arr value is "+arr[i]+"  j is "+j);
 			if(!(arr[i]==j)) {
			System.out.println("the missing element is "+(i+1));	
 			break;
 			}
		}
	}
	}


