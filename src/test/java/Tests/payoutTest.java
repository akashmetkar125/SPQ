package Tests;

import java.awt.AWTException;
import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseTest1;
import PageObject.android.TopUpSPQ;

public class payoutTest extends BaseTest1 {
	
	@BeforeMethod
	public void login() throws MalformedURLException, InterruptedException {
		
		//Thread.sleep(50000);
		cofiguration();
//		Login login = new Login();
//		login.LoginMethod();
		
		
	}
	
	@Test
public static void Withdraw() throws Exception {
		
		TopUpSPQ tspq = new TopUpSPQ();
		tspq.Withdrawal("10");
		Home();
	}
	
	@AfterMethod
	public void driverQuit() throws InterruptedException, AWTException, MalformedURLException {
//		tearDown();

	}
	
	
	

}
