package PageObject.android;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.collect.ImmutableMap;

import Base.BaseTest1;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class Login extends BaseTest1 {

	public Login() {
		super();

		PageFactory.initElements(driver, this); //
	}
	
	@FindBy(xpath = "//android.widget.Button[@text='While using the app']")
	public WebElement location;
	
	@FindBy(xpath = "//android.widget.Button[@text='Allow']")
	public WebElement notification;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id='com.sportiqoV2:id/collapse_button']")
	public WebElement closeUpdatePopUp;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Skip']")
	public WebElement skip;

	@FindBy(xpath = "//android.widget.EditText[@hint='Enter your phone number']")
	public WebElement mobile;

	@FindBy(xpath = "//android.widget.TextView[@text='Send Code']")
	public WebElement sendCode;

	@FindBy(xpath = "//android.widget.EditText[@resource-id='otpInput-0']")
	public WebElement otp1;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='otpInput-1']")
	public WebElement otp2;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='otpInput-2']")
	public WebElement otp3;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='otpInput-3']")
	public WebElement otp4;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='otpInput-4']")
	public WebElement otp5;
	
	@FindBy(xpath = "//android.widget.EditText[@resource-id='otpInput-5']")
	public WebElement otp6;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Continue']")
	public WebElement Continue;
	
	@FindBy(xpath = "//android.widget.Button[@resource-id='com.sportiqoV2:id/collapse_button']")
	public WebElement closeFirebasePopup;

	@FindBy(xpath = "//android.widget.Toast[contains(@text,'JD-SRIDGE']")
	public WebElement textMessage;

	/*-------------------------------------------------------------------------------------------------------------*/

	public void LoginMethod() throws InterruptedException, AWTException {
		// Thread.sleep(50000);
		
		Thread.sleep(2000);
		clickOn(location);
		Thread.sleep(2000);
		clickOn(notification);
		Thread.sleep(2000);
//		clickOn(closeUpdatePopUp);
		Thread.sleep(2000);

		clickOn(skip);
		Thread.sleep(5000);
		sendKey(mobile, "8857020738");
		clickOn(sendCode);
		Thread.sleep(5000);
		
		sendKey(otp1, "1");
		Thread.sleep(2000);
		sendKey(otp2, "2");
		Thread.sleep(2000);
		sendKey(otp3, "3");
		Thread.sleep(2000);
		sendKey(otp4, "4");
		Thread.sleep(2000);
		sendKey(otp5, "5");
		Thread.sleep(2000);
		sendKey(otp6, "0");
		Thread.sleep(2000);
		
		clickOn(Continue);
		Thread.sleep(2000);
//		clickOn(closeFirebasePopup);
		Thread.sleep(2000);
		clickOn(skip);
		Thread.sleep(2000);
		HandleFirebasePopUp();
		
//		String newOtp = mesesage();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		driver.navigate().back();
//		isDisplayed(otp);
//		Thread.sleep(2000);
//        longPressAction(otp);
//		rushikesh coordinates
//		SwipeByCordinate(250, 760, 250, 760, 3000);
//		clickByCordinates(187, 641);
		
//		akash coordinates
//		SwipeByCordinate(250, 950, 250, 950, 3000);
//		clickByCordinates(250, 850);

		// sendKey(otp, newOtp);
//		Thread.sleep(2000);
//		clickOn(submit);

//		PointOption copyotp,pasteotp;
//		copyotp = PointOption.point(210, 408);
//		pasteotp= PointOption.point(570, 427);
//		TouchAction touchAction=new TouchAction(driver);
//		touchAction.tap(copyotp).perform();
//		Thread.sleep(2000);
//		//clickOn(otp);
//		touchAction.tap(pasteotp).perform();
//		//x200 y427
//		
//		
//		clickOn(submit);
//		
//		//X570 y597 for otp paste

	}

}
