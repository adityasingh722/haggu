package firstPackage;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;


public class login extends base{

	
 @Test(priority = 1, description = "masti hai", enabled = true)
  public void tc1() {
	 
	 logger = extent.createTest("TC01");
	 logger.log(Status.INFO, "Doing Step1");
	 System.out.println("TC01");
	 logger.log(Status.INFO, "Doing Step2");
	 System.out.println("Entering Credentilas");
	 
	 Assert.assertFalse(true);
  }
  
 
 @Test(priority = 2, description = "masti hai", enabled = true)
 public void tc2() {
	 
	 logger = extent.createTest("TC02");
	 logger.log(Status.INFO, "Doing Step1");
	  System.out.println("TC02");
	 
 }

 
 @Test(priority = 3, description = "masti hai", enabled = true)
  public void tc3() {
	 
	 logger = extent.createTest("TC03");
	 logger.log(Status.INFO, "Doing Step1");
	 System.out.println("TC03");
	 
  }
	
}