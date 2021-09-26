package TC_InVue;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PO_Functions.AddNewUserPage;
import PO_Functions.LoginPage;



public class TC_NewUserTest_002 extends BaseClass {

	@Test
	public void AddNewUser() {
		
		LoginPage lp=new LoginPage(driver);
		lp.login();
		logger.info("login successful");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AddNewUserPage newuser=new AddNewUserPage(driver);
		newuser.Adduser();
		logger.info("user created");
		
		
	
		
		
	}

	
}
