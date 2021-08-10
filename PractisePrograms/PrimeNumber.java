package PractisePrograms;

public class PrimeNumber {
 
	public static void main(String[] args) {
		
		int Input=13;
		boolean flag=false;
		int a=Input/2;
		for (int i = 2; i <= a; i++) {
			
			int remainder=Input%i;
			if(remainder==0) {
				flag=true;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println("Not a Prime Number");
		}else {
			System.out.println("Prime Number");
		}
			
		
	}

}
