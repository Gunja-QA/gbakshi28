package Learning;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com");	
		driver.manage().window().maximize();

		WebElement TextBox = driver.findElementByName("field-keywords");
		TextBox.sendKeys("infant toys rotational hovering"+Keys.ENTER);
	}

}
