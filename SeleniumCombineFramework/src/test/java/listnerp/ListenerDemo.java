package listnerp;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class ListenerDemo implements ITestListener

{
	public void onTestStart(ITestResult result) {
		System.out.println("on test start" + result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test finish" + result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("on test faliure" + result.getName());
	}
	public void onTestSkipped(ITestResult result) {
	 System.out.println("on test faliure" + result.getName());
	}
	public void onStart(ITestContext context) {
		System.out.println("on test start" + context.getName());
	}
	public void onFinish(ITestContext context) {
		System.out.println("on test finish" + context.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}
}
