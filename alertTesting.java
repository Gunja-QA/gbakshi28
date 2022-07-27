package Learning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		
		WebElement NormalAlert1 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div/div/button");
		NormalAlert1.click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
		WebElement ConfirmAlert = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/button");
		ConfirmAlert.click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.accept();
		
		ConfirmAlert.click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.dismiss();
		
		WebElement PromptAlert = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[3]/div/div/button");
		PromptAlert.click();
		
		Alert alert4 = driver.switchTo().alert();
		alert4.sendKeys("Vikram");
		Thread.sleep(2000);
		alert4.accept();		
		
	}

}
