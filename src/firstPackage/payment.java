package firstPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class payment extends base {

@Test(priority = 4, dataProvider = "getData")
public void tc04(String name, String password) {
	
	System.out.println("TC04");
	System.out.println("Id = "+ name);
	System.out.println("Password = "+ password);
}
	

	
@DataProvider
public String[][] getData() {
	
	String[][] arr = new String[2][2];
	
	arr[0][0] = "username1";
	arr[0][1] = "pswd1";
	
	arr[1][0] = "username2";
	arr[1][1] = "pswd2";
	
	
	
	
	return arr;
}
}