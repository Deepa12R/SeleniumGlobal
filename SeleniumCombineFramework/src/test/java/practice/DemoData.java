package practice;

import org.testng.annotations.Test;

import generics.ExcelUtility;

public class DemoData {
	@Test(dataProvider="testdata",dataProviderClass=ExcelUtility.class)
	public void demo(String data1,String data2,String data3)

	{
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
}
