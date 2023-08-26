package FunctionTest;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_Opportunities_02_Test extends Baseclass {
	@Test
	public void FT_Opportunities()
	{
		FundT2.getOpportunitiesTab().click();
		if(FundT2.getOpportunitiesLink().isDisplayed())
		{
			System.out.println("the Opportunities page is Opened");
			
		}
		else
		{
			System.out.println("the Opportunities page is not Opened");
	}
	
	}

}
