package generics;

import java.util.Random;

public class JavaUtility {
public int generatingRandomNumber(int range)
{
	/**
	 * this method is used to generate random numbers
	 */
	Random ran = new Random();
	return ran.nextInt(range);
}
}
