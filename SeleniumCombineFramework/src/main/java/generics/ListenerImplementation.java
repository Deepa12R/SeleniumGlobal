package generics;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener {
	public ExtentReports report;
	public static ExtentTest logger;

	public void onStart(ITestContext context) {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/executionreport.html/");
		reporter.config().setDocumentTitle("sample report");
		reporter.config().setTheme(Theme.STANDARD);
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("platform", "windows");
		report.setSystemInfo("author", "Ishita");
	}

	public void onTestStart(ITestResult result) {
		logger = report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "This test case" + result.getName() + "is sucess");
	}

	public void onTestFailure(ITestResult result) {
		logger.log(Status.FAIL, "This test case" + result.getName() + "is failed");
	ScreenshotUtility utility = new ScreenshotUtility();
	logger.addScreenCaptureFromPath(utility.takingScreenshot(result.getName()));
	}
	public void onFinish(ITestContext context) {
		report.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
	}
}