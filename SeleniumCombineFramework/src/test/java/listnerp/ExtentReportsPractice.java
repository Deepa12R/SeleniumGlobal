package listnerp;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsPractice 
{
public static void main(String[] args) 
{
ExtentSparkReporter reporter=new ExtentSparkReporter("./reports/selenium.html/")	;
reporter.config().setDocumentTitle("sample report");
reporter.config().setTheme(Theme.STANDARD);
ExtentReports report=new ExtentReports();
report.attachReporter(reporter);
report.setSystemInfo("platform", "windows");
report.setSystemInfo("author", "Ishita");
ExtentTest Logger = report.createTest("sample test");
Logger.log(Status.FAIL, "This is failed");
Logger.log(Status.INFO, "This is the information");
Logger.log(Status.PASS, "This is passed");
System.out.println("done");
report.flush();
}
}