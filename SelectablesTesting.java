package SeleniumAdvanced;

import java.util.List;

//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectablesTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/selectable.html");
		driver.manage().window().maximize();


List<WebElement> select = driver.findElementsByXPath("//*[@id='selectable']/li");
int size = select.size();
System.out.println(size);

Actions actions = new Actions(driver);

//actions.keyDown(Keys.CONTROL).click(select.get(0)).click(select.get(1)).click(select.get(3)).build().perform();

actions.clickAndHold(select.get(0)).click(select.get(6)).build().perform();

driver.quit();
	}

}
