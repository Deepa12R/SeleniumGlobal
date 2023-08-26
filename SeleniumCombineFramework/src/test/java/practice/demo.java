package practice;


import org.testng.annotations.Test;
import generics.ExcelUtility;

public class demo {

	@Test(dataProvider="testdata",dataProviderClass=ExcelUtility.class)
	
	public void demo(String d, String e)
	{
		System.out.println(d+" "+e);
	}
}
       