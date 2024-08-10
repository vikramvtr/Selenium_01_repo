package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[.='Departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='July 2024']/../..//p[text()='15']")).click();
		

	}

}
