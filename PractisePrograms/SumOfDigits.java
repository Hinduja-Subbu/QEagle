package PractisePrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=1534;
		int quo=0,rem=0,result=0;
		while(num>0)
		{
		quo=num/10;
		rem=num%10;
		result=result+rem;
		num=quo;
		}
System.out.println("Result is :  "+result);
	}

}
