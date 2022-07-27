package Learning;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testingButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().window().maximize();

		//WebElement button1 = driver.findElementById("home");

		//button1.click();

		WebElement button2 = driver.findElementByXPath("//*[@id=\'position\']");

		Point xy_loc = button2.getLocation();

		int x = xy_loc.getX();
		int y = xy_loc.getY();

		System.out.println("X location is :"+x);
		System.out.println("Y location is :"+y);

		WebElement button3 = driver.findElementById("color");

		String colorVal = button3.getCssValue("background-color");

		System.out.println("Button3 color is : "+colorVal );
		
		WebElement button4 = driver.findElementById("size");
		
		Dimension ButSize = button4.getSize();
		
		int height = ButSize.getHeight();
		int width = ButSize.getWidth();
		
		System.out.println("Height is :"+height+" and widh is "+width);
		
		



	}

}
