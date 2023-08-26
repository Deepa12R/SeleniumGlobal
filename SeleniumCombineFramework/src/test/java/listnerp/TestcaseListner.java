package listnerp;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerDemo.class)
public class TestcaseListner

{
	@Test
	public void demoForListener()

	{
		System.out.println("done for test case");
	}

	@Test
	public void demoForListenerMethods() {
		System.out.println("done from demoForListenerMethods");
	}
}
