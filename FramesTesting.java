package SeleniumAdvanced;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		//Click on "I AM inside an iFrame" button
		
		driver.switchTo().frame(0);
		WebElement FirstFrame = driver.findElementByXPath("//*[@id=\'Click\']");
		FirstFrame.click();
		String frameClickText = FirstFrame.getText();
		System.out.println(frameClickText);
		
		//Get control from frame back to parent html page.
		
		driver.switchTo().defaultContent();
		
		
		//Click on Second "I am inside a nested frame" button
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement SecondBut = driver.findElementById("Click1");
		SecondBut.click();
		String secondButText = SecondBut.getText();
		System.out.println(secondButText);
		

		//Set control back to parent html page
		driver.switchTo().defaultContent();
		
		//Count number of iFrames in the html page
		
		List<WebElement> iframeCount = driver.findElementsByTagName("iframe");
		int size = iframeCount.size();
		System.out.println("Total number of iframes in this page is: "+size);
	}

}
