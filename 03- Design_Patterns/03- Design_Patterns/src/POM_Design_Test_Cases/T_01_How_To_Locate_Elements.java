package POM_Design_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_01_How_To_Locate_Elements {

	static WebDriver driver;
	static Home_Page home = new Home_Page();
	static Sign_in sign_in = new Sign_in();

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Launch_Browser();

		Login_With_Invalid_Email();

		Verify_Forgot_Email_URL();

		Google_Search();

		Close_Driver();

	}

	// Before Test
	public static void Launch_Browser() {

		String chromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/?hl=ar");

		driver.findElement(By.partialLinkText("Eng")).click();
	}

	// Test Case 1: Login without using email field
	public static void Login_With_Invalid_Email() throws InterruptedException {

		home.SignInBtn(driver).click();

		Sign_in sign_in = new Sign_in();
		sign_in.Enter_Email(driver).sendKeys("test");
		sign_in.Next_button(driver).click();
		Thread.sleep(2000);
		String actualResult;
		actualResult = sign_in.actual_Result(driver).getText();
		System.out.println(actualResult);
		System.out.println(actualResult.contains("Couldn't find your Google Account"));

	}

	// Test Case 2: Get forget email url
	public static void Verify_Forgot_Email_URL() {

		driver.findElement(By.xpath("//button[@jsname=\"Cuz2Ue\"]")).click();

		String actualResult;
		actualResult = driver.getCurrentUrl();

		System.out.println(actualResult);
		System.out.println(actualResult.contains("/signin/v2/usernamerecovery"));

	}

	// Test Case 3: Google Search
	public static void Google_Search() {
		driver.navigate().to("https://www.google.com/?hl=eng");
		home.search(driver);
		System.out.println(home.search_result(driver).getText());
		System.out.println(home.serach_text(driver).getText().contains("713,000,000"));

	}

	// After Test
	public static void Close_Driver() {
		driver.quit();

	}

}
