package Learning;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBoxTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		WebElement box1 = driver.findElementById("email");

		box1.sendKeys("viks054@gmail.com");

		WebElement box2 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");

		box2.sendKeys("VIKRAM");

		WebElement box3 = driver.findElementByName("username");

		String returnText = box3.getAttribute("value");

		System.out.println("String returned is: "+returnText);

		WebElement box4 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[4]/div/div/input");

		box4.clear();
		
		WebElement box5 = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[5]/div/div/input");
		
		boolean status = box5.isEnabled();
		
		if (status == true)
		System.out.println("Box5 is enabled");
		else
			System.out.println("Box5 is Disabled");
	}

}
