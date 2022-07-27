package SeleniumAdvanced;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		
		WebElement dragElement = driver.findElementById("draggable");
		WebElement dropElement = driver.findElementById("droppable");
		
		Actions actions = new Actions(driver);
		//First Way to do
		//actions.clickAndHold(dragElement).moveToElement(dropElement).release(dropElement).build().perform();

		//Second way to do
		actions.dragAndDrop(dragElement, dropElement).build().perform();
		
		
	}

}
