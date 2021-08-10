package PractisePrograms;

public class TwoSum {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		int s=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				
			{
				if(arr[i]+arr[j]==s)
				{
					System.out.print(arr[i]+(","));
					System.out.println(arr[j]);
				}
			}
		}

	}

}
