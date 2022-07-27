package SeleniumAdvanced;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
		
	    WebElement text = driver.findElementById("age");
	    String textValue = text.getAttribute("title");
	    System.out.println(textValue);
		
	}

}
