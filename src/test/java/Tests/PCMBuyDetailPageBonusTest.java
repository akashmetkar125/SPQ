package Tests;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest1;
import PageObject.android.BuySell;
import PageObject.android.Login;
import PageObject.android.TopUpSPQ;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PCMBuyDetailPageBonusTest extends BaseTest1 {

	@BeforeMethod
	public void login() throws InterruptedException, AWTException, MalformedURLException {
		// Thread.sleep(50000);
		cofiguration();
//		Login login = new Login();
//		login.LoginMethod();

	}

	@Test
	public static void PcBonusBuyDetailPage() throws Exception {
		//clickOn(home);
		BuySell pcd = new BuySell();
		pcd.BuyBonusPCDetail("1");
		Home();
		Thread.sleep(5000);
	}

	@AfterMethod
	public void driverQuit() throws InterruptedException, AWTException, MalformedURLException {
//		tearDown();

	}
}
