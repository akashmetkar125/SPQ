package Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class BaseTest1 {

	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;

	@FindBy(xpath = "//android.view.View[3]/android.view.ViewGroup/android.view.ViewGroup")
	public static WebElement home;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[4]")
	public static WebElement wallet;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'limit set by house is')]")
	public static WebElement error;

	@FindBy(xpath = "//android.widget.TextView[@text='Close']")
	public static WebElement close;

	@FindBy(xpath = "//android.widget.TextView[@text='I Agree']")
	public static WebElement IAgree;

	@FindBy(xpath = "//android.view.ViewGroup[@index='4']//android.widget.EditText[@index='0']")
	public static WebElement enterPC;

	@FindBy(xpath = "//android.widget.TextView[@text='BUY']")
	public static WebElement BUY;

	@FindBy(xpath = "//android.widget.TextView[@text='Funds Available for Withdrawal']/following-sibling::android.widget.TextView")
	public static WebElement SpqForWithdraw;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Add money']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/preceding-sibling::android.widget.TextView")
	public static WebElement SpqForTrading;
	

	@FindBy(xpath = "//android.widget.TextView[@text='']")
	public static WebElement checkBox;

	@FindBy(xpath = "//android.widget.TextView[@text='Total Amount']/following-sibling::android.widget.TextView")
	public static WebElement totalAmount;

	@FindBy(xpath = "//android.widget.TextView[@text='Transactions']")
	public static WebElement transactions;

	@FindBy(xpath = "//android.widget.TextView[@text='Player Stock']")
	public static WebElement playercounters;

	@FindBy(xpath = "//android.widget.TextView[@text='Market']")
	public static WebElement markettext;

	@FindBy(xpath = "//android.widget.TextView[@text='Portfolio']")
	public static WebElement portfoliotext;

	@FindBy(xpath = "//android.widget.TextView[@text='Matches']")
	public static WebElement matchestext;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]")
	public static WebElement profileIcon;
	
	@FindBy(xpath = "//android.view.ViewGroup[@index='1']//android.view.View[@index='1']/android.view.View[@index='4']")
	public static WebElement pointstext;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[5]")
	public static WebElement points;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[1]")
	public static WebElement pcTransfered;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.TextView[2]")
	public static WebElement spqTransfered;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.google.android.apps.messaging:id/swipeableContainer' and @index='0']")
	public static WebElement resourceId;

	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.apps.messaging:id/suggestion_button_label']")
	public static WebElement copy;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Value')]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]")
	public static WebElement arrow;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[1]")
	public static WebElement Market;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Retry']")
	public static WebElement retry;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm Payment']")
	public static WebElement confirm;

	@FindBy(xpath = "//android.widget.TextView[@text='Buy']")
	public static WebElement buybutton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Enter sell quantity:']/following-sibling::android.view.ViewGroup[@index='1']/android.widget.EditText")
	public static WebElement SellenterPC;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sell']")
	public static WebElement sellButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	public static WebElement Sellconfirm;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Withdrawals in 30 minutes!']")
	public static WebElement popUp;

	

	public static void cofiguration() throws MalformedURLException, InterruptedException {
		service = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//dell03022022//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();

//		Thread.sleep(10000);

		UiAutomator2Options options = new UiAutomator2Options();

		options.setDeviceName("One Plus 9RT");
		// options.setDeviceName("Pixel 4 XL API 30");

		options.setChromedriverExecutable(
				"C:\\ChromeDriver\\chromedriver.exe");
		options.setApp("D:\\Build\\app-release (11).apk");
//		options.setUdid("JN499TA6XOF6OB9X");
//		options.setPlatformName("Android");

		options.noReset();

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("==========driver Started===================");
	}

	public static void longPressAction(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public static void sendKey(WebElement locator, String value) {

		new WebDriverWait(driver, Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.sendKeys(value);
		System.out.println(locator.toString() + " sendedKeys");

	}

	public static void isDisplayed(WebElement locator) {

		new WebDriverWait(driver, Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.isDisplayed();
		System.out.println(locator.toString() + " Displayed");
	}

	public static void Market() throws InterruptedException {

		Thread.sleep(10000);
		clickByCordinates(120, 2150);

		try {
			isDisplayed(markettext);
		} catch (Exception e) {
			clickOn(Market);
		}

	}

	public static void Wallet() throws InterruptedException {

		Thread.sleep(10000);
		clickByCordinates(770, 2120);
		try {
			isDisplayed(portfoliotext);
		} catch (Exception e) {
			clickOn(wallet);
		}
	}

	public static void Match() throws InterruptedException {

		Thread.sleep(10000);
		clickByCordinates(315, 2120);
		try {
			isDisplayed(matchestext);
		} catch (Exception e) 
		{
			System.out.println("unable to click via co-ordinate , trying with xpath");
			clickOn(Market);
		}
	}
	public static void Points() throws InterruptedException {

		Thread.sleep(10000);
		clickByCordinates(960, 2110);
		try {
			isDisplayed(pointstext);
		} catch (Exception e) 
		{
			System.out.println("unable to click via co-ordinate , trying with xpath");
			clickOn(points);
		}
	}
	
	public static void ProfileIcon() throws InterruptedException {

		Thread.sleep(5000);
		

		try {
			clickByCordinates(100, 190);
		} catch (Exception e) {
			clickOn(profileIcon);
		}
	}
	

	public static void clickOn(WebElement locator) {

		new WebDriverWait(driver, Duration.ofSeconds(10)).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
		System.out.println(locator.toString() + " clicked");
	}

	public static void swipeAndClick(WebElement locator, int count, int q, int w, int y, int r) throws Exception {
		int i = 1;
		while (i <= count) {
			if (i == count) {
				throw new Exception("webelement not found while swiping");

			}
			try {
				locator.click();
				break;

			} catch (Exception e) {
				SwipeByCordinate(q, w, y, r, 2000);
				SwipeByCordinate(q - 100, w, y - 100, r, 2000);
				i++;
			}
		}

	}

	public static void swipeAndIsDisplayed(WebElement locator, int count, int q, int w, int y, int r) throws Exception {
		int i = 1;
		while (i <= count) {
			if (i == count) {
				throw new Exception("webelement not found while swiping");

			}
			try {
				locator.isDisplayed();
				SwipeByCordinate(q, w - 400, y, r, 2000);
				break;

			} catch (Exception e) {
				SwipeByCordinate(q, w, y, r, 2000);

				i++;
			}
		}

	}

	public static float PlayerBalanceFromWallet(WebElement locator) throws InterruptedException {
		String StringNeymarSilvaBalance = locator.getText();// (1.00 Stocks)
		int p = StringNeymarSilvaBalance.length();
		String InitialStringplayerBalance = StringNeymarSilvaBalance.substring(1, p - 8);
		float InitialNeymarSilvaBalance = Float.parseFloat(InitialStringplayerBalance);
		return InitialNeymarSilvaBalance;
	}

	public static float TotalRewards(WebElement locator) throws InterruptedException {
		String TotalRewards = locator.getText();
		int l = TotalRewards.length();
		String TotalReward = TotalRewards.substring(0, l - 4);
		float TotalRewardsDisplayed = Float.parseFloat(TotalReward);
		return TotalRewardsDisplayed;

	}

	public static float ExpectedSpq() throws InterruptedException {
		String expectedSpq = totalAmount.getText();
		int l = expectedSpq.length();
		String amount = expectedSpq.substring(2, l);
		float ExpectedSpq = Float.parseFloat(amount);
		System.out.println("ExpectedSpq= " + ExpectedSpq);
		return ExpectedSpq;
	}

	public static void Home() throws InterruptedException {
		Activity activity = new Activity("com.sportiqoV2", "com.sportiqoV2.MainActivity");
		driver.startActivity(activity);
		Thread.sleep(5000);
	}

	public static String mesesage() throws InterruptedException {
		Activity activity = new Activity("com.google.android.apps.messaging",
				"com.google.android.apps.messaging.ui.ConversationListActivity");
		driver.startActivity(activity);
		Thread.sleep(10000);
		clickOn(resourceId);
		isDisplayed(copy);
		clickOn(copy);
		String rawotp = copy.getText();
		int l = rawotp.length();
		String otp = rawotp.substring(6, l - 1);
		System.out.println(otp + " otp");
		// int i=Integer.parseInt(otp);
		return otp;

	}

	public static void clickByCordinates(int s1, int s2) {
		PointOption pointOptionStart, pointOptionEnd;
		pointOptionStart = PointOption.point(s1, s2);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(pointOptionStart).perform();
	}

	public static void SwipeByCordinate(int s1, int s2, int e1, int e2, int t1) {

		PointOption pointOptionStart, pointOptionEnd;
		pointOptionStart = PointOption.point(s1, s2);
		pointOptionEnd = PointOption.point(e1, e2);

		new TouchAction(driver).press(pointOptionStart)
				// a bit more reliable when we add small wait
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(t1))).moveTo(pointOptionEnd).release().perform();
	}

	public String getScreenshotPath(String testCaseName, AppiumDriver driver) throws IOException {
		File source = driver.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir") + "//reports" + testCaseName + ".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		// 1. capture and place in folder //2. extent report pick file and attach to
		// report

	}

	public static void MinmaxMethod() throws IOException {
		try {
			clickOn(IAgree);
		} catch (Exception e) {
			System.out.println(e);
			String s1 = error.getText();
			String s2 = s1.substring(30, 33);
			String s3 = s2.trim();
			System.out.println(s3);
			// Thread.sleep(2000);
			clickOn(close);
			// Thread.sleep(2000);
			enterPC.clear();
			sendKey(enterPC, s3);
			// Thread.sleep(2000);
			clickOn(BUY);
			// Thread.sleep(2000);
			clickOn(IAgree);
		}

	}

	public static void MinmaxMethodForSell() throws IOException {
		try {
			clickOn(checkBox);
		} catch (Exception e) {
			System.out.println(e);
			String s1 = error.getText();
			String s2 = s1.substring(30, 33);
			String s3 = s2.trim();
			System.out.println(s3);
			// Thread.sleep(2000);
			clickOn(close);
			// Thread.sleep(2000);
			enterPC.clear();
			sendKey(enterPC, s3);
			// Thread.sleep(2000);
			clickOn(BUY);
			// Thread.sleep(2000);
			clickOn(IAgree);
		}

	}

	public static String PCMWalletButton() throws InterruptedException {
		String buttunPath = null;
		for (int i = 0; i <= 5; i++) {

			buttunPath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[" + i
					+ "]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView";
			if (i > 0) {
				if (i % 3 == 0) {
					SwipeByCordinate(550, 1930, 550, 1170, 2000);
					i = 0;
				}
			}

			try {
				driver.findElement(By.xpath(buttunPath)).click();
				System.out.println("buttunPath found successfully= " + buttunPath);

				break;

			} catch (Exception e) {
				System.out.println("xpath Not found with index  = " + i);
			}

		}
		return buttunPath;

	}

	public static String isDisplayedPCMWalletButton() throws InterruptedException {
		String buttunPath = null;
		for (int i = 0; i <= 5; i++) {

			buttunPath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[" + i
					+ "]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView";
			if (i > 0) {
				if (i % 3 == 0) {
					SwipeByCordinate(550, 1930, 550, 1170, 2000);
					i = 0;
				}
			}

			try {
				driver.findElement(By.xpath(buttunPath)).isDisplayed();
				System.out.println("buttunPath found successfully= " + buttunPath);
				return buttunPath;

			} catch (Exception e) {
				System.out.println("xpath Not found with index  = " + i);
			}

		}
		return buttunPath;

	}

	public static void PCOWalletButton() throws InterruptedException {

		for (int i = 1; i <= 5; i++) {

			String buttunPath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[" + i
					+ "]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView";
			if (i % 4 == 0) {
				SwipeByCordinate(550, 1930, 550, 1170, 2000);
				i = 1;
			}
			// System.out.println("buttunPath = " + buttunPath);

			try {
				boolean result = driver.findElement(By.xpath(buttunPath)).isDisplayed();
			}

			// System.out.println("xpath Not found with index = " + i);
			catch (Exception e) {
				System.out.println("xpath found with index successfully= " + i);
				driver.findElement(By
						.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[" + i + "]"))
						.click();
				break;
			}

		}

	}

	public static float formatToFloat(String phone) {

		int i = phone.length();
		String part3 = phone.substring(0, i);

		// String str = "India, China, Bhutan, ";
		part3 = part3.replace(",", "");
//		System.out.println(part3);

		float f = Float.parseFloat(part3);

		System.out.println(f);
		return f;

	}

	public static float getSpqBalanceWithdrawal() throws InterruptedException {
		Thread.sleep(7000);
		clickOn(arrow);
		Thread.sleep(2000);
		isDisplayed(SpqForWithdraw);
		String SpqLB = SpqForWithdraw.getText();
		float SpqBalance = formatToFloat(SpqLB);
		return SpqBalance;
	}
	
	public static float getSpqBalanceTrading() throws InterruptedException {
		Thread.sleep(7000);
		isDisplayed(SpqForTrading);
		String SpqLB = SpqForTrading.getText();
		float SpqBalance = formatToFloat(SpqLB);
		return SpqBalance;
	}

	public float[] getTrxDetail() throws Exception {

		// clickOn(wallet);
		Thread.sleep(3000);
		clickByCordinates(750, 2150);
		Thread.sleep(3000);

		clickOn(transactions);
		Thread.sleep(2000);
		clickOn(playercounters);
		Thread.sleep(10000);
		isDisplayed(pcTransfered);
		String pctext = pcTransfered.getText();
		System.out.println(pctext);
		int k = pctext.length();
		String pc = pctext.substring(0, k);
		float floatpctransferd = Float.parseFloat(pc);
		System.out.println("floatpctransferd = " + floatpctransferd);

		String spqtext = spqTransfered.getText();
		System.out.println(spqtext);
		int j = spqtext.length();
		String spq = spqtext.substring(2, j);
		float floatspqtransferd = Float.parseFloat(spq);
		System.out.println("floatspqtransferd = " + floatspqtransferd);

		float[] sample = { floatpctransferd, floatspqtransferd };
		return sample;

	}
	
	public static void RetryHandleBuy(String pb) throws IOException, InterruptedException {
		try {
			confirm.click();
		} catch (Exception e) {
			clickOn(retry);
			 Thread.sleep(2000);
            sendKey(enterPC, pb);
			 Thread.sleep(2000);
			clickOn(buybutton);
			 Thread.sleep(2000);
			clickOn(IAgree);
			checkBox.click();
			 SwipeByCordinate(500, 1700, 500, 200, 500);
			confirm.click();
		}

	}
	
	public static void RetryHandleSell(String pb) throws IOException, InterruptedException {
		try {
			Sellconfirm.click();
		} catch (Exception e) {
			clickOn(retry);
			 Thread.sleep(2000);
            sendKey(SellenterPC, pb);
			 Thread.sleep(2000);
			clickOn(sellButton);
//			 Thread.sleep(1000);
			checkBox.click();
			 SwipeByCordinate(500, 1700, 500, 200, 500);
			 Sellconfirm.click();
		}	 
				
		}
		
		public static void HandleFirebasePopUp() {
			
			try {
			if(popUp.isDisplayed()) {
				 SwipeByCordinate(500, 925,290, 300,290);
			}	 else {
				System.out.println("No firebase pop up is displayed");
			}

			}catch(Exception e ) {
				System.out.println("No firebase pop up is displayed");
				
			}
			
			}			
					

	public static void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
//		service.stop();
		System.out.println("==========driver quit===================");
	}

}
