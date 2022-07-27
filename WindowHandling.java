package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();


		//Click on Home Button
		WebElement homeButton = driver.findElementById("home");
		homeButton.click();

		String parentWindow = driver.getWindowHandle();

		Set<String> handles = driver.getWindowHandles();

		for(String AllWindow : handles)
		{
			driver.switchTo().window(AllWindow);
			driver.manage().window().maximize();
		}

		WebElement EditOp = driver.findElementByXPath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a");
		EditOp.click();

		driver.close();


		//Click on Multi Window button in Parent window and count the total number of windows opened		
		driver.switchTo().window(parentWindow);

		WebElement MultiWindow = driver.findElementByXPath("//*[@id=\'contentblock\']/section/div[2]/div/div/button");
		MultiWindow.click();
		Set<String> windowHandles = driver.getWindowHandles();
		int size = windowHandles.size();
		System.out.println("Number of windows open is: "+size);


		//Click on "Do Not Close Me" button and close all child windows

		driver.switchTo().window(parentWindow);

		WebElement colorBut = driver.findElementByXPath("//*[@id=\'color\']");
		colorBut.click();

		Set<String> ChildWindows = driver.getWindowHandles();

		for(String curWin : ChildWindows) {

			if(!curWin.equals(parentWindow)){
				driver.switchTo().window(curWin);
				driver.close();	
			}
		}

	}




}


