package PageObject.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest1;

public class BuySell extends BaseTest1 {
	
	
	public BuySell() {
		super();

		PageFactory.initElements(driver, this); //
	}

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[1]")
	public WebElement market;

	@FindBy(xpath = "//android.view.ViewGroup[3]/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement TradeButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Buy']")
	public WebElement buyButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Pay with cash']")
	public WebElement cashToggle;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Pay with bonus']")
	public WebElement bonusToggle;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sell for Cash']")
	public WebElement sellCash;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sell for Bonus']")
	public WebElement sellBonus;
	
	@FindBy(xpath = "//android.widget.HorizontalScrollView//android.widget.TextView[@text='BUY']")
	public WebElement buyButtonHorizontalScrollView;

	@FindBy(xpath = "//android.view.ViewGroup[@resource-id='RNE_BUTTON_WRAPPER']")
	public WebElement buyButtonSheet;

	@FindBy(xpath = "//android.widget.TextView[@text='Sell']")
	public WebElement sellButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Enter buy quantity:']/following-sibling::android.view.ViewGroup[@index='1']/android.widget.EditText")
	public WebElement enterPC;

	@FindBy(xpath = "//android.widget.TextView[@text='Enter sell quantity:']/following-sibling::android.view.ViewGroup[@index='1']/android.widget.EditText")
	public WebElement SellenterPC;

	@FindBy(xpath = "//android.widget.TextView[@text='BUY']")
	public WebElement BUY;

	@FindBy(xpath = "//android.widget.TextView[@text='Sell']")
	public WebElement Sell;

	@FindBy(xpath = "//android.widget.TextView[@text='I Agree']")
	public WebElement IAgree;

	@FindBy(xpath = "//android.widget.TextView[@text='']")
	public WebElement checkBox;

	@FindBy(xpath = "//android.widget.TextView[@text='Confirm Payment']")
	public WebElement confirm;

	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	public WebElement Sellconfirm;

	@FindBy(xpath = "//android.widget.TextView[@text='Continue']")
	public WebElement continueButton;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.view.ViewGroup[3]/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button/android.widget.TextView")
	public WebElement buyHot;

	@FindBy(xpath = "//android.view.ViewGroup[@index='4']//android.widget.EditText[@index='0']")
	public WebElement Enterpc;

	@FindBy(xpath = "//android.widget.TextView[@text='BUY']")
	public WebElement BuyButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'limit set by house is')]")
	public WebElement error;

	@FindBy(xpath = "//android.widget.TextView[@text='Close']")
	public WebElement close;

	@FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[4]")
	public WebElement wallet;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.ImageView")
	public WebElement walletTradeButton;

	@FindBy(xpath = "//android.widget.TextView[@text='  +  AT test']")
	public WebElement selectTournament;

	@FindBy(xpath = "//android.widget.TextView[@text='Neymar Silva']")
	public WebElement NeymarSilva;

	@FindBy(xpath = "//android.widget.TextView[@text='Lionel Messi']")
	public WebElement LionelMessi;

	// BuySellPCDetailPage.java=========================================================================================================================

	@FindBy(xpath = "//android.view.ViewGroup[@index='6']//android.view.ViewGroup[@index='0']")
	public WebElement clickPC;

	@FindBy(xpath = "//android.widget.TextView[@text='Confirm']")
	public WebElement confirmSell;

	@FindBy(xpath = "//android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup")
	public WebElement clickonPC;

	/*-------------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//android.widget.TextView[@text='Buy']")
	public WebElement Buy;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]")
	public WebElement firstCard;

	@FindBy(xpath = "//android.widget.TextView[@text='Available Balance']/following-sibling::android.widget.TextView")
	public WebElement Spq;

	@FindBy(xpath = "//android.widget.TextView[@text='SPQ']/parent::android.view.ViewGroup/preceding-sibling::android.view.ViewGroup[4]/android.widget.EditText")
	public WebElement YouPay;

	@FindBy(xpath = "//android.widget.TextView[@text='Total Amount']/following-sibling::android.widget.TextView")
	public WebElement totalAmount;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")
	public WebElement counterName;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Lokesh Rahul')]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='2']/android.widget.TextView[@index='4']")
	public WebElement playerBalance;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Neymar Silva')]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='1']//android.widget.TextView[contains(@text,'Stocks')]")
	public WebElement NeymarSilvaBalance;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Lionel Messi')]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='1']//android.widget.TextView[contains(@text,'Stocks')]")
	public WebElement LionelMessiBalance;

	@FindBy(xpath = "//android.widget.TextView[@text='Lionel Messi']")
	public WebElement LionelMessiPCMarket;

	@FindBy(xpath = "//android.widget.TextView[@text='Neymar Silva']")
	public WebElement NeymarSilvaPC;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Lionel Messi')]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='2']//android.widget.TextView[@text='BUY']")
	public WebElement LionelMessiTradeButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Popular')]")
	public WebElement popular;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Favorites')]")
	public WebElement favorites;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Neymar Silva')]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='2']//android.widget.TextView[@text='BUY']")
	public WebElement NeymarSilvaTradeButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Lionel Messi')]/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='2']//android.widget.TextView[@text='SELL']")
	public WebElement LionelMessiTradeSellButton;

	@FindBy(xpath = "//android.widget.TextView[contains(@text,'Lionel Messi')]/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='2']/android.view.ViewGroup[@index='6']/android.widget.ImageView")
	public WebElement MessiWalletTradeButton;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.View/android.view.View[2]")
	public WebElement matches;

	@FindBy(xpath = "//android.widget.TextView[@text='Upcoming Matches']")
	public WebElement upcomingmatch;

	@FindBy(xpath = "//android.widget.TextView[@text='Upcoming Matches']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[@index='1']")
	public WebElement pcCard;
	// android.widget.TextView[@text=''Trading]
	@FindBy(xpath = "//android.widget.TextView[@text=''Trading]")
	public WebElement trading;

	@FindBy(xpath = "//android.widget.TextView[@text='IPOs']")
	public WebElement ipo;
	/*-------------------------------------------------------------------------------------------------------------*/

	public void BuyPCM(String pb) throws Exception {
		Thread.sleep(5000);
		// clickOn(wallet);
//		clickByCordinates(750, 2150);
		Wallet();
		Thread.sleep(1000);
		float SpqInitialBalance = getSpqBalanceTrading();
		swipeAndIsDisplayed(LionelMessi, 5, 500, 1900, 500, 1200);

		float InitialLionelMessiBalance = PlayerBalanceFromWallet(LionelMessiBalance);

		System.out.println(InitialLionelMessiBalance);

//		Home();

		// clickOn(market);
		Market();
		Thread.sleep(3000);
		swipeAndClick(selectTournament, 15, 850, 500, 200, 500);

		clickOn(LionelMessiTradeButton);

		sendKey(enterPC, pb);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		Thread.sleep(2000);
		clickOn(BUY);
		Thread.sleep(2000);
		clickOn(IAgree);

		// Thread.sleep(2000);
//		MinmaxMethod();

		float ExpectedSpq = ExpectedSpq();
		float ExpectedPC = Float.parseFloat(pb);

//		clickOn(checkBox);
//
//		SwipeByCordinate(500, 1700, 500, 100, 500);
//
//		clickOn(confirm);
		
		checkBox.click();
		confirm.click();

		clickOn(continueButton);

		System.out.println("Buy successfully");

		clickOn(wallet);
		Thread.sleep(6000);
		float SpqLaterBalance = getSpqBalanceTrading();
		swipeAndIsDisplayed(LionelMessi, 5, 500, 1900, 500, 1200);

		float LaterLionelMessiBalance = PlayerBalanceFromWallet(LionelMessiBalance);

		System.out.println(LaterLionelMessiBalance);

		if (ExpectedPC == LaterLionelMessiBalance - InitialLionelMessiBalance) {
			System.out.println("pc balance Pass");
		} else {
			throw new Exception("expected pc balance is not equal to actual pc balance");
		}

		float result = SpqLaterBalance - SpqInitialBalance;

		float result1 = result;
		if (result < 0) {
			result1 = result - (2 * result);
		}

		if (result1 - ExpectedSpq >= 0.01 || result1 - ExpectedSpq <= -0.01) {
			System.out.println("result1 - ExpectedSpq =" + (result1 - ExpectedSpq));
			throw new Exception("expected spq balance is not equal to actual spq balance");
		} else {
			System.out.println("result1 - ExpectedSpq =" + (result1 - ExpectedSpq));
			System.out.println("spq balance Pass");

		}

		float getTrxDetail[] = getTrxDetail();

		float pcTransferedQty = getTrxDetail[0];
		float spqTransferedQty = getTrxDetail[1];

		if (pcTransferedQty == LaterLionelMessiBalance - InitialLionelMessiBalance) {
			System.out.println("pc balance Pass in transction page");
		} else {
			throw new Exception("expected pc balance is not equal to actual pc balance in transction page");
		}

		if (spqTransferedQty - ExpectedSpq >= 0.01 || spqTransferedQty - ExpectedSpq <= -0.01) {
			System.out.println("result1 - ExpectedSpq =" + (spqTransferedQty - ExpectedSpq));
			throw new Exception("expected spq balance is not equal to actual spq balance in transction page");
		} else {
			System.out.println("result1 - ExpectedSpq =" + (spqTransferedQty - ExpectedSpq));
			System.out.println("spq balance Pass in transction page");
		}

	}

	public void BuyPcmFromPopularMethod(String pb) throws Exception {

		Home();

		// clickOn(market);
		Market();

		Thread.sleep(3000);
		swipeAndClick(selectTournament, 15, 700, 300, 200, 300);

		clickOn(popular);

		clickOn(LionelMessiTradeButton);

		sendKey(enterPC, pb);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		Thread.sleep(2000);
		clickOn(BUY);
		Thread.sleep(2000);
		clickOn(IAgree);

		// Thread.sleep(2000);
//		MinmaxMethod();

		clickOn(checkBox);

		SwipeByCordinate(500, 1700, 500, 100, 500);

		clickOn(confirm);

		clickOn(continueButton);

		System.out.println("Buy successfully");

	}

	public void BuyPcmFromfavoriteMethod(String pb) throws Exception {

		Home();

		// clickOn(market);
		Market();

		Thread.sleep(3000);
		swipeAndClick(selectTournament, 15, 700, 300, 200, 300);

		clickOn(favorites);

		clickOn(LionelMessiTradeButton);

		sendKey(enterPC, pb);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		Thread.sleep(2000);
		clickOn(BUY);
		Thread.sleep(2000);
		clickOn(IAgree);

		// Thread.sleep(2000);
//		MinmaxMethod();

		clickOn(checkBox);

		SwipeByCordinate(500, 1700, 500, 100, 500);

		clickOn(confirm);

		clickOn(continueButton);

		System.out.println("Buy successfully");

	}

	public void SellPCM(String pb) throws Exception {
		Thread.sleep(5000);
		// clickOn(wallet);
//		clickByCordinates(750, 2150);
		Wallet();
		Thread.sleep(5000);
		float SpqInitialBalance = getSpqBalanceTrading();
		swipeAndIsDisplayed(LionelMessi, 5, 500, 1900, 500, 1200);

		float InitialLionelMessiBalance = PlayerBalanceFromWallet(LionelMessiBalance);

		System.out.println(InitialLionelMessiBalance);

//		Home();
		Market();
		
		Thread.sleep(10000);
//		clickByCordinates(120, 2150);
//		clickOn(market);
		Thread.sleep(2000);
		swipeAndClick(selectTournament, 15, 850, 500, 200, 500);
		Thread.sleep(2000);
		clickOn(LionelMessiTradeSellButton);

		sendKey(SellenterPC, pb);

		clickOn(Sell);
		Thread.sleep(1000);
		MinmaxMethodForSell();
		Thread.sleep(2000);

		float ExpectedSpq = ExpectedSpq();
		float ExpectedPC = Float.parseFloat(pb);

//		clickOn(Sellconfirm);
		Sellconfirm.click();
		clickOn(continueButton);

		Thread.sleep(5000);
		// clickOn(wallet);
//		clickByCordinates(750, 2150);
		Wallet();
		Thread.sleep(5000);
		float SpqLaterBalance = getSpqBalanceTrading();
		swipeAndIsDisplayed(LionelMessi, 5, 500, 1900, 500, 1200);

		float LaterLionelMessiBalance = PlayerBalanceFromWallet(LionelMessiBalance);

		System.out.println(LaterLionelMessiBalance);

		if (ExpectedPC == InitialLionelMessiBalance - LaterLionelMessiBalance) {
			System.out.println("pc balance Pass");
		} else {
			throw new Exception("expected pc balance is not equal to actual pc balance");
		}

		float result = SpqInitialBalance - SpqLaterBalance;

		float result1 = result;
		if (result < 0) {
			result1 = result - (2 * result);
		}

		if (result1 - ExpectedSpq >= 0.01 || result1 - ExpectedSpq <= -0.01) {
			System.out.println("result1 - ExpectedSpq =" + (result1 - ExpectedSpq));
			throw new Exception("expected spq balance is not equal to actual spq balance");
		} else {
			System.out.println("result1 - ExpectedSpq =" + (result1 - ExpectedSpq));
			System.out.println("spq balance Pass");

		}

		float getTrxDetail[] = getTrxDetail();

		float pcTransferedQty = getTrxDetail[0];
		float spqTransferedQty = getTrxDetail[1];

		if (pcTransferedQty == LaterLionelMessiBalance - InitialLionelMessiBalance) {
			System.out.println("pc balance Pass in transction page");
		} else {
			throw new Exception(InitialLionelMessiBalance + "-" + LaterLionelMessiBalance
					+ "  expected pc balance is not equal to actual pc balance in transction page");
		}

		if (spqTransferedQty - ExpectedSpq >= 0.01 || spqTransferedQty - ExpectedSpq <= -0.01) {
			System.out.println("result1 - ExpectedSpq =" + (spqTransferedQty - ExpectedSpq));
			throw new Exception("expected spq balance is not equal to actual spq balance in transction page");
		} else {
			System.out.println("result1 - ExpectedSpq =" + (spqTransferedQty - ExpectedSpq));
			System.out.println("spq balance Pass in transction page");
		}

	}

	public void SellPC() throws Exception {

		clickOn(matches);
		Thread.sleep(5000);
		swipeAndClick(selectTournament, 5, 1000, 300, 100, 300);
		Thread.sleep(5000);
		swipeAndClick(upcomingmatch, 5, 500, 1400, 500, 200);
		Thread.sleep(3000);
		clickOn(pcCard);
		Thread.sleep(2000);

		clickOn(LionelMessiTradeButton);
		Thread.sleep(2000);
		sendKey(enterPC, "1");
		Thread.sleep(2000);

		isDisplayed(trading);

	}

	public void Buy_HotPC(String pb) throws Exception {

		Home();

		clickOn(buyHot);

		sendKey(enterPC, pb);

		clickOn(BuyButton);

		try {
			clickOn(IAgree);
		} catch (Exception e) {
			System.out.println(e);
			String s1 = error.getText();
			String s2 = s1.substring(30, 35);
			String s3 = s2.trim();
			System.out.println(s3);

			clickOn(close);

			enterPC.clear();
			sendKey(enterPC, s3);

			clickOn(BUY);

			clickOn(IAgree);
		}

		clickOn(checkBox);
		Thread.sleep(2000);
		SwipeByCordinate(500, 1700, 500, 100, 500);

		clickOn(confirm);

		clickOn(continueButton);

	}

	public void BuyPCMFromWallet(String qty) throws Exception {

		Thread.sleep(15000);

		clickByCordinates(750, 2150);

		clickOn(LionelMessiTradeButton);

		sendKey(enterPC, qty);

		clickOn(BUY);
		Thread.sleep(1000);
		MinmaxMethod();

		clickOn(checkBox);
		Thread.sleep(2000);

		clickOn(confirm);

		clickOn(continueButton);

	}

	public void SellPCMFromWallet(String qty) throws Exception {

		Wallet();

		clickOn(LionelMessiTradeSellButton);

		sendKey(SellenterPC, qty);

		clickOn(Sell);
		Thread.sleep(1000);
		MinmaxMethodForSell();
		Thread.sleep(2000);

		SwipeByCordinate(500, 1700, 500, 100, 500);
		Thread.sleep(2000);
		clickOn(Sellconfirm);
		Thread.sleep(2000);
		clickOn(continueButton);

	}
	// BuySellPCDetailPage.java=========================================================================================================================

	public void BuyBonusPCDetail(String pb) throws Exception {

		Thread.sleep(2000);
		HandleFirebasePopUp();

		Market();

		swipeAndClick(selectTournament, 15, 975, 595, 300, 595);
		Thread.sleep(2000);
		swipeAndClick(LionelMessiPCMarket, 15, 500, 1800, 500, 1200);
		Thread.sleep(2000);
		clickOn(buyButton);
		Thread.sleep(1000);
		sendKey(enterPC, pb);
		Thread.sleep(1000);
		clickOn(bonusToggle);
		Thread.sleep(1000);
		clickOn(buyButton);
		Thread.sleep(2000);
		MinmaxMethod();

//		clickOn(checkBox);
		checkBox.click();
		SwipeByCordinate(500, 1700, 500, 300, 500);
//		confirm.click();
		RetryHandleBuy("1");
//		clickOn(confirm);
		Thread.sleep(2000);
		clickOn(continueButton);
		Thread.sleep(2000);
		System.out.println("Stock buy successfully");

	}
	
	public void BuyCashPCDetail(String pb) throws Exception {

		Thread.sleep(2000);
		HandleFirebasePopUp();

		Market();

		swipeAndClick(selectTournament, 15, 975, 595, 300, 595);
		Thread.sleep(2000);
		swipeAndClick(LionelMessiPCMarket, 15, 500, 1800, 500, 1200);
		Thread.sleep(2000);
		clickOn(buyButton);
		Thread.sleep(1000);
		sendKey(enterPC, pb);
		Thread.sleep(1000);
		clickOn(cashToggle);
		Thread.sleep(1000);
		clickOn(buyButton);
		Thread.sleep(1000);
		MinmaxMethod();

//		clickOn(checkBox);
		checkBox.click();
		SwipeByCordinate(500, 1700, 500, 200, 500);
//		confirm.click();
		RetryHandleBuy("1");
//		clickOn(confirm);
		Thread.sleep(2000);
		clickOn(continueButton);
		Thread.sleep(2000);
		System.out.println("Stock buy successfully");

	}

	public void SellCashPCDetail(String pb) throws Exception {

		// for successfully execution of PCSellDetailPageTest.java,
		// PCBuyDetailPageTest.java test should run before this test .
		// first PCBuyDetailPageTest.java will by the pc and after that same pc will be
		// sell by PCSellDetailPageTest.java

		

		Market();
		Thread.sleep(2000);
		swipeAndClick(selectTournament, 15, 975, 595, 300, 595);
		Thread.sleep(2000);
		swipeAndClick(LionelMessiPCMarket, 15, 500, 1800, 500, 1200);
		Thread.sleep(2000);
		clickOn(sellButton);
		Thread.sleep(1000);
		sendKey(SellenterPC, pb);
		Thread.sleep(1000);
		clickOn(sellCash);
		Thread.sleep(1000);
		clickOn(sellButton);

		
//		clickOn(checkBox);
		checkBox.click();
		SwipeByCordinate(500, 1700, 500, 200, 500);
//		clickOn(Sellconfirm);
//		Sellconfirm.click();
		RetryHandleSell("1");
		clickOn(continueButton);
		System.out.println("Stocks sold successfully");
		
		}
	public void SellBonusPCDetail(String pb) throws Exception {

		// for successfully execution of PCSellDetailPageTest.java,
		// PCBuyDetailPageTest.java test should run before this test .
		// first PCBuyDetailPageTest.java will by the pc and after that same pc will be
		// sell by PCSellDetailPageTest.java

		

		Market();
		Thread.sleep(2000);
		swipeAndClick(selectTournament, 15, 975, 595, 300, 595);
		Thread.sleep(2000);
		swipeAndClick(LionelMessiPCMarket, 15, 500, 1800, 500, 1200);
		Thread.sleep(2000);
		clickOn(sellButton);
		Thread.sleep(2000);
		sendKey(SellenterPC, pb);
		Thread.sleep(1000);
		clickOn(sellBonus);
		Thread.sleep(1000);
		clickOn(sellButton);

		
//		clickOn(checkBox);
		checkBox.click();
		SwipeByCordinate(500, 1700, 500, 200, 500);
//		clickOn(Sellconfirm);
//		Sellconfirm.click();
		RetryHandleSell("1");
		clickOn(continueButton);
		System.out.println("Stocks sold successfully");
		
		}
			

	public void PCOBuy(String pb) throws Exception {

		Home();
		Market();
		clickOn(ipo);
		swipeAndClick(selectTournament, 5, 1000, 300, 100, 300);
		Thread.sleep(3000);
		clickOn(NeymarSilvaPC);
		// Thread.sleep(2000);
		clickOn(buyButton);
		// Thread.sleep(2000);
		sendKey(enterPC, pb);
		// Thread.sleep(2000);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		clickOn(BUY);
		// Thread.sleep(2000);

		MinmaxMethod();

		// Thread.sleep(2000);
		clickOn(checkBox);
		// Thread.sleep(2000);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		// Thread.sleep(2000);
		clickOn(confirm);
		// Thread.sleep(2000);
		clickOn(continueButton);
		// Thread.sleep(2000);

	}

	// BuyPCMTest.java
	public void BuyPC(String pb) throws Exception {

		// clickOn(wallet);
		Wallet();
		Thread.sleep(10000);
		float SpqInitialBalance = getSpqBalanceTrading();
		swipeAndIsDisplayed(NeymarSilva, 25, 500, 1900, 500, 1200);

		float InitialNeymarSilvaBalance = PlayerBalanceFromWallet(NeymarSilvaBalance);

		System.out.println(InitialNeymarSilvaBalance);

		Market();
		clickOn(ipo);

		swipeAndClick(selectTournament, 15, 700, 300, 200, 300);
		// Thread.sleep(10000);
		clickOn(buyButtonHorizontalScrollView);

		// Thread.sleep(10000);
		sendKey(enterPC, pb);
		Thread.sleep(2000);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		clickOn(BUY);
		Thread.sleep(2000);
		try {
			clickOn(IAgree);
		} catch (Exception e) {
			System.out.println(e);
			String s1 = error.getText();
			String s2 = s1.substring(30, 36);
			String s3 = s2.trim();
			System.out.println(s3);
			// Thread.sleep(2000);
			clickOn(close);
			// Thread.sleep(2000);
			enterPC.clear();
			sendKey(enterPC, s3);
			// Thread.sleep(2000);
			SwipeByCordinate(500, 1700, 500, 100, 500);
			clickOn(BUY);
			// Thread.sleep(2000);
			clickOn(IAgree);
		}

		float ExpectedSpq = ExpectedSpq();
		float ExpectedPC = Float.parseFloat(pb);

		// Thread.sleep(2000);
		clickOn(checkBox);
		Thread.sleep(2000);
		SwipeByCordinate(500, 1700, 500, 100, 500);
		clickOn(confirm);
		Thread.sleep(2000);
		clickOn(continueButton);
		Thread.sleep(2000);

		clickOn(wallet);
		Thread.sleep(6000);
		float SpqLaterBalance = getSpqBalanceTrading();
		swipeAndIsDisplayed(NeymarSilva, 25, 500, 1900, 500, 1200);

		float LaterNeymarSilvaBalance = PlayerBalanceFromWallet(NeymarSilvaBalance);

		System.out.println(LaterNeymarSilvaBalance);

		if (ExpectedPC == LaterNeymarSilvaBalance - InitialNeymarSilvaBalance) {
			System.out.println("pc balance Pass");
		} else {
			throw new Exception("expected pc balance is not equal to actual pc balance");
		}

		float result = SpqLaterBalance - SpqInitialBalance;

		float result1 = result;
		if (result < 0) {
			result1 = result - (2 * result);
		}

		if (result1 - ExpectedSpq >= 0.01 || result1 - ExpectedSpq <= -0.01) {
			System.out.println("result1 - ExpectedSpq =" + (result1 - ExpectedSpq));
			throw new Exception("expected spq balance is not equal to actual spq balance");
		} else {
			System.out.println("result1 - ExpectedSpq =" + (result1 - ExpectedSpq));
			System.out.println("spq balance Pass");

		}

		float getTrxDetail[] = getTrxDetail();

		float pcTransferedQty = getTrxDetail[0];
		float spqTransferedQty = getTrxDetail[1];

		if (pcTransferedQty == LaterNeymarSilvaBalance - InitialNeymarSilvaBalance) {
			System.out.println("pc balance Pass in transction page");
		} else {
			throw new Exception("expected pc balance is not equal to actual pc balance in transction page");
		}

		if (spqTransferedQty - ExpectedSpq >= 0.01 || spqTransferedQty - ExpectedSpq <= -0.01) {
			System.out.println("result1 - ExpectedSpq =" + (spqTransferedQty - ExpectedSpq));
			throw new Exception("expected spq balance is not equal to actual spq balance in transction page");
		} else {
			System.out.println("result1 - ExpectedSpq =" + (spqTransferedQty - ExpectedSpq));
			System.out.println("spq balance Pass in transction page");
		}

	}

	public void BuyPCOFromWallet(String qty) throws Exception {

//		clickOn(wallet);
//		Thread.sleep(6000);
		Wallet();
		SwipeByCordinate(500, 2000, 500, 1500, 1);
		clickOn(NeymarSilvaTradeButton);

		sendKey(enterPC, qty);

		clickOn(BUY);
		Thread.sleep(1000);
		MinmaxMethod();

		clickOn(checkBox);
		Thread.sleep(2000);

		clickOn(confirm);

		clickOn(continueButton);

	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
