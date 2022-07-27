package Learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		WebElement link1 = driver.findElementByLinkText("Go to Home Page");
		
		Thread.sleep(3000);
		
		link1.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement link2 = driver.findElementByPartialLinkText("Home Page");
		
		link2.click();
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		WebElement link3 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[1]/div/div/a");
		
		link3.click();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		
	}

}
