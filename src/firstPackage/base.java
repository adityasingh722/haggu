package firstPackage;




import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class base {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;

	
	@BeforeSuite
	public void startReport() {
		
		htmlReporter = new ExtentHtmlReporter("I:\\Reportlatest.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.SUCCESS) {
			logger.log(Status.PASS, "Test case pass is "+ result.getName());		
	}
		
        if(result.getStatus()==ITestResult.FAILURE) {
			logger.log(Status.FAIL, "Test case fail is "+ result.getName()+result.getThrowable());
	}
        
        if(result.getStatus()==ITestResult.SKIP) {
			logger.log(Status.SKIP, "Test case skip is "+ result.getName());
	}
	}

	@AfterSuite
	public void endReport() {
		extent.flush();
	}
    
   
	@BeforeMethod
	public void launchbrowser() {
					System.out.println("Chrome browser launched");
		
	}
	
	@AfterMethod
	public void closebrowser() {
		System.out.println("Chrome browser closed");
	}
}
