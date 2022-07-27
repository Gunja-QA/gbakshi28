package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryProjectAutoComplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		WebElement txtBox = driver.findElementById("tags");
		txtBox.click();
		txtBox.sendKeys("C");
		Thread.sleep(3000);

		List<WebElement> listOfOption = driver.findElementsByXPath("//*[@id=\'ui-id-1\']/li");
		int size = listOfOption.size();
		System.out.println(size);

		for(WebElement iter : listOfOption) {
			if(iter.getText().equals("Scala")) {
				iter.click();
				break;
			}
		}



	}

}
