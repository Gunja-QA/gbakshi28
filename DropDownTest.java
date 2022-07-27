package Learning;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();

		WebElement drop1 = driver.findElementById("dropdown1");

		Select select1 = new Select(drop1);

		select1.selectByIndex(1);
		
		WebElement drop2 = driver.findElementByName("dropdown2");
		Select select2 = new Select(drop2);
		select2.selectByVisibleText("Appium");
		
		WebElement drop3 = driver.findElementByName("dropdown3");
		Select select3 = new Select(drop3);
		select3.selectByValue("3");
		
		WebElement drop4 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/select");
		Select select4 = new Select(drop4);
		List<WebElement> opt = select4.getOptions();
		int s = opt.size();
		System.out.println("Size of dropdown is : "+s);
		
		
		WebElement drop5 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[5]/select");
		drop5.sendKeys("LoadRunner");
		
		WebElement drop6 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[6]/select");
		Select select6 = new Select(drop6);
		select6.selectByIndex(2);
		select6.selectByIndex(4);
		
		
		

	}

}
