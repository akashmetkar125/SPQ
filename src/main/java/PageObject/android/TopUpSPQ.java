package PageObject.android;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest1;

public class TopUpSPQ extends BaseTest1 {
	
	
	static String trx_id, amount, token;

	public TopUpSPQ() {
		super();

		PageFactory.initElements(driver, this); //
	}

	@FindBy(xpath = "//android.view.ViewGroup[@index='1']/android.view.View[@index='1']//android.view.View[@index='3']")
	public WebElement portfolio;

	@FindBy(xpath = "//android.widget.TextView[@text='Add money']")
	public WebElement addmoney;

	@FindBy(xpath = "//android.widget.TextView[@text='Withdraw']")
	public WebElement withdraw;

	@FindBy(xpath = "//android.widget.TextView[@text='Enter INR amount']/following-sibling::android.view.ViewGroup[@index='1']/android.widget.EditText[@index='0']")
	public WebElement enterAmount;

	@FindBy(xpath = "//android.widget.TextView[@text='Enter INR amount to withdraw']/following-sibling::android.view.ViewGroup[@index='3']/android.widget.EditText[@index='0']")
	public WebElement enterWithdrawAmount;

	@FindBy(xpath = "//android.widget.TextView[@text='Proceed to Payment']")
	public WebElement proceedToPay;

	@FindBy(xpath = "//android.widget.TextView[@text='Proceed']")
	public WebElement proceedToWithdraw;

	@FindBy(xpath = "//android.widget.TextView[@text='Withdraw in progress']")
	public WebElement withdrawToast;

	@FindBy(xpath = "//android.widget.TextView[@text='Close']")
	public WebElement closeWithdraw;

	@FindBy(xpath = "//android.view.ViewGroup[@index='10']//android.widget.ImageView")
	public WebElement checkBox;

	@FindBy(xpath = "//android.widget.TextView[@text='Proceed']")
	public WebElement proceed;

	@FindBy(xpath = "//android.widget.EditText[@text='Enter Transaction ID']")
	public WebElement enterTrnxId;

	@FindBy(xpath = "//android.view.ViewGroup[@index='3']//android.view.ViewGroup[@index='1']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']")
	public WebElement uploadUrl;

	@FindBy(xpath = "//android.widget.TextView[@text='Submit']")
	public WebElement submit;

	@FindBy(xpath = "//android.widget.TextView[@text='Verification in progress']")
	public WebElement verifyText;

	@FindBy(xpath = "//android.widget.TextView[@text='Okay']")
	public WebElement okay;

	@FindBy(xpath = "//android.widget.TextView[@text='']")
	public WebElement cross;

	/*-------------------------------------------------------------------------------------------------------------*/

	@FindBy(xpath = "//android.widget.TextView[@text='Continue']")
	public WebElement contimue;

	@FindBy(xpath = "//android.widget.TextView[@text='Transactions']")
	public WebElement transactions;

	@FindBy(xpath = "//android.widget.TextView[@text='Player Stock']")
	public WebElement playercounters;

	@FindBy(xpath = "//android.widget.TextView[@text='Funds']")
	public WebElement fundsTransactions;

	@FindBy(xpath = "//android.widget.ScrollView[@index='0']//android.view.ViewGroup[@index='1']//android.view.ViewGroup[@index='0']/android.widget.TextView[@index='0']")
	public WebElement firstTrnx;
	// android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]

	@FindBy(xpath = "//android.widget.TextView[@text='Copy']")
	public WebElement copy;

	@FindBy(xpath = "//android.widget.TextView[@text='BUY']/following-sibling::android.widget.TextView[@index='1']")
	public WebElement getPcQty;

	@FindBy(xpath = "//android.widget.TextView[@text='Reference Number']/following-sibling::android.view.ViewGroup[@index='1']//android.widget.TextView[@index='0']")
	public WebElement refNo;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[2]")
	public WebElement pcTransfered;

	@FindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.TextView[4]")
	public WebElement spqTransfered;

	@FindBy(xpath = "//android.widget.TextView[@text='Pay with IMPS/UPI']/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup//android.widget.ImageView")
	public WebElement ManualOption;

	@FindBy(xpath = "//android.widget.TextView[@text='Proceed']")
	public WebElement proceedButton;

	@FindBy(xpath = "//android.widget.EditText[@text='Enter Transaction ID']")
	public WebElement EntertrxId;

	@FindBy(xpath = "//android.widget.EditText[@text='Enter Transaction ID']")
	public WebElement imageUrl;

	@FindBy(xpath = "//android.view.ViewGroup[@index='4']/android.widget.ScrollView[@index='0']/android.view.ViewGroup[@index='0']/android.view.ViewGroup[@index='0']")
	public WebElement PhonePe;

	@FindBy(xpath = "//android.widget.TextView[@text='Submit']")
	public WebElement submitButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Complete KYC']")
	public WebElement compProfilePopUp;

	@FindBy(xpath = "//android.widget.TextView[@text='KYC must be completed before withdrawing funds']/preceding-sibling::android.widget.TextView[@index='0']")
	public WebElement closePopUp;

	@FindBy(xpath = "//android.widget.TextView[@text='Portfolio Value']/parent::android.view.ViewGroup/parent::android.view.ViewGroup/following-sibling::android.view.ViewGroup[1]")
	public WebElement dropdown;

	@FindBy(xpath = "//android.widget.TextView[@text='Funds Available for Trading']/following-sibling::android.widget.TextView")
	public WebElement fundBalance;
	/*-------------------------------------------------------------------------------------------------------------*/

	@SuppressWarnings("unchecked")
//	public void PostApiPrIssued() throws Exception {
//		RestAssured.registerParser("text/plain", Parser.JSON);
//
//		String response0=DBtoken();
//		String respone2 = "Bearer " + response0;
//
//		JSONObject post = new JSONObject();
//
//		post.put("amount", 60.06);
//		post.put("gatewayTrxDateTime", "2023-06-07T12:56:07");
//		post.put("gatewayUsed", "RestAssured");
//		post.put("status", "SUCCESS");
//		post.put("trxId", "0x9C75Aac5bbCD271Ac0A");
//		post.put("gatewayTrxId", "NA");
//		post.put("remarks", "Automation");
//
//		System.out.println(post.toJSONString());
//		given().body(post.toJSONString()).header("Authorization", respone2).header("Content-Type", "application/json")
//				.when().post("https://walletapi-qa.sportiqo.com/wallets/fiatPaymentStatus").then().log().all()
//				.statusCode(200);
//	}

//	public String DBtoken() throws Exception {
//
//		Connection connection = DriverManager.getConnection(
//				"jdbc:postgresql://spq-qa-db01.cu9isu4v9eh3.ap-southeast-1.rds.amazonaws.com:5432/spq_preprod_db",
//				"spqprodadmin", "X#kqe4x0N3%u7J*If1fLGS&Z");
//
//		if (connection.isClosed()) {
//
//		} else {
//			System.out.println("We have successfully connected to the database");
//		}
//
//		Statement statement = connection.createStatement();
//
//		ResultSet resultSet = statement.executeQuery("SELECT token FROM public.db_token dt");
//
//		while (resultSet.next()) {
//			token = resultSet.getString("token");
//
//			System.out.println("token= " + token);
//
//		}
//		return token;
//	}

	public void TopUpFiat(String qty) throws Exception {
		
		System.out.println("started TopUpFiat");
//		try {
//
//			clickOn(cross);
//		} catch (Exception e) {
//			System.out.println("continue without clicking on popup");
//		}

//		if (cross.isDisplayed()) {
//			clickOn(cross);
//		}

		Thread.sleep(2000);
		Wallet();
//		clickOn(portfolio);
		Thread.sleep(2000);
		float SpqInitialBalance = getSpqBalanceTrading();
		clickOn(addmoney);
		Thread.sleep(2000);
//		enterAmount.clear();
		sendKey(enterAmount, qty);
		// Thread.sleep(2000);
		clickOn(proceedToPay);
		Thread.sleep(2000);
		clickOn(ManualOption);
//		clickOn(checkBox);
		Thread.sleep(2000);
		clickOn(proceed);
		Thread.sleep(2000);
//		SwipeByCordinate(500, 1700, 500, 300, 500);
//		Thread.sleep(2000);
//		clickOn(proceed);
		Thread.sleep(2000);
		sendKey(enterTrnxId, "TEST_TRX_145236");
		Thread.sleep(2000);
//		sendKey(uploadUrl, "C:\\Users\\dell03022022\\Downloads");
		clickOn(submitButton);
		Thread.sleep(2000);
		System.out.println(verifyText.getText());
		clickOn(okay);
	
//insert query for adding new entry in fiat_payment_status table

		TopUpSPQ tspq = new TopUpSPQ();
		tspq.fiat_payment_status_entry();
		
//		try {
//
//			clickOn(cross);
//		} catch (Exception e) {
//			System.out.println("continue without clicking on popup");
//		}

		Thread.sleep(30000);

		Wallet();
//		clickOn(portfolio);
//		SwipeByCordinate(550, 100, 550, 1000, 3);
		Thread.sleep(2000);
		float SpqfinalBalance = getSpqBalanceTrading();
		float topupAmount = Float.parseFloat(qty);
		

		if (topupAmount == SpqfinalBalance - SpqInitialBalance) {
			System.out.println(" --topUp successfull-- " +topupAmount);
		} else {
			throw new Exception("topUp failed,balance not matching");
		}
	}

	public void fiat_payment_status_entry() throws Exception {

		Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://spq-qa-db01.cu9isu4v9eh3.ap-southeast-1.rds.amazonaws.com:5432/spq_preprod_db",
				"spqprodadmin", "X#kqe4x0N3%u7J*If1fLGS&Z");

		if (connection.isClosed()) {

		} else {
			System.out.println("We have successfully connected to the database");
		}

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(
				"select trx_flow_id ,total_fiat_price from spq_trx_flow  where   created_at in (select max(created_at) from spq_trx_flow where user_id in (select id  from users where mobile ='+918857020738')  )");

		while (resultSet.next()) {
			trx_id = resultSet.getString("trx_flow_id");
			amount = resultSet.getString("total_fiat_price");
			System.out.println("trx_id= " + trx_id);
			System.out.println("amount= " + amount);

		}

		try {
			String Query = "INSERT INTO fiat_payment_status (trx_id,status,amount,remarks) VALUES('" + trx_id
					+ "','SUCCESS','" + amount + "','set by automation');";

			statement.executeQuery(Query);

		} catch (Exception e) {
//			System.out.println(e);
		}
	}

	public void fiat_payment_status_entry_forWithdrawal() throws Exception {

		Connection connection = DriverManager.getConnection(
				"jdbc:postgresql://spq-qa-db01.cu9isu4v9eh3.ap-southeast-1.rds.amazonaws.com:5432/spq_preprod_db",
				"spqprodadmin", "X#kqe4x0N3%u7J*If1fLGS&Z");

		if (connection.isClosed()) {

		} else {
			System.out.println("We have successfully connected to the database");
		}

		Statement statement = connection.createStatement();

		ResultSet resultSet = statement.executeQuery(
				"select trx_flow_id ,total_fiat_price from spq_trx_flow  where   created_at in (select max(created_at) from spq_trx_flow where user_id in (select id  from users where mobile ='+918857020738')  )");

		while (resultSet.next()) {
			trx_id = resultSet.getString("trx_flow_id");
			amount = resultSet.getString("total_fiat_price");
			System.out.println("trx_id= " + trx_id);
			System.out.println("amount= " + amount);

		}

		try {
			String Query = "INSERT INTO fiat_payment_status (trx_id,status,amount,remarks) VALUES('" + trx_id
					+ "','SUCCESS','" + amount + "','set by automation');";

			String Query1 = "update fiat_imps_trx_withdrawal set status ='CONFIRMED'where trx_id ='" + trx_id + "'";

			statement.executeQuery(Query);
			Thread.sleep(2000);
			statement.executeQuery(Query1);

		} catch (Exception e) {
//			System.out.println(e);
		}
	}

	public void Withdrawal(String qty) throws Exception {
		
//		try {
//
//			clickOn(cross);
//		} catch (Exception e) {
//			System.out.println("continue without clicking on popup");
//		}
		// Thread.sleep(8000);
		
		Wallet();
		Thread.sleep(2000);
		float SpqInitialBalance =  getSpqBalanceTrading();
		clickOn(withdraw);
		Thread.sleep(2000);
		sendKey(enterWithdrawAmount, qty);
		Thread.sleep(2000);
		clickOn(proceedToWithdraw);
		Thread.sleep(2000);

		if (closeWithdraw.isDisplayed()) {
			System.out.println("Withdrawal request initiated succesffully");
		}

		clickOn(closeWithdraw);
		Home();

		TopUpSPQ tspq = new TopUpSPQ();
		tspq.fiat_payment_status_entry_forWithdrawal();
		
//		try {
//
//			clickOn(cross);
//		} catch (Exception e) {
//			System.out.println("continue without clicking on popup");
//		}

		Thread.sleep(25000);

		Wallet();
		Thread.sleep(2000);
		float SpqfinalBalance = getSpqBalanceTrading();
		float withdrawAmount = Float.parseFloat(qty);

		if (withdrawAmount == SpqInitialBalance - SpqfinalBalance) {
			System.out.println("--Withdraw successfull--" +withdrawAmount );
		} else {
			throw new Exception(
					"Withdraw failed,balance not matching " + "withdrawAmount =" + (SpqInitialBalance - SpqfinalBalance));
		}
	}
	

	public void CompProfilePopUp() throws InterruptedException {

		Thread.sleep(8000);
		clickOn(portfolio);
		Thread.sleep(2000);
		clickOn(withdraw);
		Thread.sleep(2000);

		if (compProfilePopUp.isDisplayed()) {

			System.out.println("For withdraw user need to complete KYC first");
		} else {

			System.out.println("KYC completed already");
		}

	}

	public void SPQTransactions() throws InterruptedException {

		clickOn(wallet);
		Thread.sleep(3000);
		clickOn(transactions);
		Thread.sleep(3000);
		clickOn(fundsTransactions);
		Thread.sleep(5000);
		clickOn(firstTrnx);
		Thread.sleep(2000);
		clickOn(copy);
		Thread.sleep(2000);
		System.out.println(refNo.getText());
		Thread.sleep(2000);
//		SwipeByCordinate(600, 1500, 600, 300,500);

	}

	public void PCTransactions() throws InterruptedException {

		clickOn(wallet);
		Thread.sleep(3000);
		clickOn(transactions);
		Thread.sleep(2000);
		clickOn(playercounters);
		Thread.sleep(5000);
		clickOn(firstTrnx);
		Thread.sleep(2000);
		clickOn(copy);
		Thread.sleep(2000);
		System.out.println(refNo.getText());
		Thread.sleep(5000);
//		SwipeByCordinate(600, 1500, 600, 300,500);

	}
}


