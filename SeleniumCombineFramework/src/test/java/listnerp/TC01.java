package listnerp;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import generics.Baseclass;
import generics.ListenerImplementation;

@Listeners(ListenerImplementation.class)
public class TC01 extends Baseclass{
@Test
	public void demo() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("testcase");
		assertEquals(true, true);
	}
}
