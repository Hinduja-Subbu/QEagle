package PractisePrograms;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";

		char[] c = test.toCharArray();

		for (int i = 0; i < c.length; i++)

		{

		//System.out.println(c[i]);
			// get the index value of the character

			char u = c[i];

			if (i % 2 != 0) {
				u = Character.toUpperCase(u);// character-> stores the primitive data type value.
				System.out.println(u);

				// System.out.println("The oddindex is" +" " +i);
			}

			/*
			 * // call the index character for the upper case change
			 * 
			 * u= Character.toUpperCase(u);// character-> stores the primitive data type
			 * value. System.out.println(u);
			 */

		}

	}

}
