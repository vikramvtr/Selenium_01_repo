package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeImplicitWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Napo");
		driver.findElement(By.className("placeHolderMainText")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bang");
		
		

	}

}
