package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();


WebElement autoComplete = driver.findElementById("tags");
autoComplete.sendKeys("S");

Thread.sleep(3000);

List<WebElement> optionList = driver.findElementsByXPath("//*[@id=\'ui-id-1\']/li");

for (WebElement listIterator : optionList) {
	if(listIterator.getText().equals("Web Services")) {
		listIterator.click();
		break;
	}

	}

}
}
