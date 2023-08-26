package FunctionTest;

import org.testng.annotations.Test;

import generics.Baseclass;

public class FT_Organizations_01_Test extends Baseclass{
	@Test
	public  void FT_TestOrganization()
	{
		FunTest1.getOrganizationTab().click();
		
		if(FunTest1.getOrganizationLink().isDisplayed())
		{
			System.out.println("the Organizaiton Tab is opned and the organization link"+FunTest1.getOrganizationLink().getText());
		}
		else
		{
			System.out.println("the organization page is not opened");
		}
		
	}

}
