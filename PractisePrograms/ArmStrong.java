package PractisePrograms;

public class ArmStrong {

	public static void main(String[] args) {
		int num=1634;
		int quo=0,rem=0,result=0;
		int original=num;
		while(num>0)
		{
			quo=num/10;
			rem=num%10;
			result=result+(rem*rem*rem*rem);
			num=quo;
			
		}
System.out.println("Result is:"+result);
if(result==original) {
	System.out.println("It is an armstrong number  "+result);
}
else
{
	System.out.println("It is not an armstrong number");
}
	}

}
