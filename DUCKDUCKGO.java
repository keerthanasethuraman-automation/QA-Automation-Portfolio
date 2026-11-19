package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DUCKDUCKGO {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://duckduckgo.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println();
		if(title.contains("Selenium WebDriver")) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		System.out.println(title);
		driver.quit();
	}

}
