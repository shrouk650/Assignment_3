package POM_Design_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	// da 27na 3mleno 3chan lw 3ndi emlemnt by3mlo locate aktar mn mara fe nfs
	// elclass
	// kul page leha class lw7do
	public WebElement SignInBtn(WebDriver driver) {
		return driver.findElement(By.id("gb_70"));

	}

	public void search(WebDriver driver) {
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	public WebElement search_result(WebDriver driver){
		return driver.findElement(By.id("result-stats"));
		
	}
	public WebElement serach_text(WebDriver driver){
		return driver.findElement(By.id("result-stats"));
		
	}
}
