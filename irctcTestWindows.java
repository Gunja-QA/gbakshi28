package SeleniumAdvanced;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class irctcTestWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();

		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div/div[2]/div/form/div[2]/button").click();
		driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[5]/a").click();

		String ParentWindow = driver.getWindowHandle();
		Set<String> ChildWindows = driver.getWindowHandles();

		for(String curWin : ChildWindows) {
			if(!curWin.equals(ParentWindow)) {
				driver.switchTo().window(curWin);
				String title1 = driver.getTitle();
				System.out.println("Title of child page is: "+title1);
			}
		}
		driver.switchTo().window(ParentWindow);
		String title2 = driver.getTitle();
		System.out.println("Title of parent page is "+title2);


	}

}
