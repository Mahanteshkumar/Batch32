package come.qa.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneScenario1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./jar/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("rings");
		driver.findElement(By.xpath("//input[@class='button']")).click();
		WebElement gen = driver.findElement(By.xpath("//span[.='Gender']"));
		Actions act=new Actions(driver);
		act.moveToElement(gen).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@data-displayname='women']")).click();
		driver.quit();
	}

}
