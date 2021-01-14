package POM_Design_Test_Cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_in {

	public WebElement Enter_Email(WebDriver driver){
		return driver.findElement(By.cssSelector("input[aria-label=\"Email or phone\"]"));
		
	}
	public WebElement Next_button(WebDriver driver){
		return driver.findElement(By.xpath("//button[@jscontroller=\"soHxf\" and @jsname=\"LgbsSe\"]"));
		
	}
	public WebElement actual_Result(WebDriver driver){
		return driver.findElement(By.xpath("//div[@jsname=\"B34EJ\"]/div[@class=\"o6cuMc\"]"));
		
		
	}
}
