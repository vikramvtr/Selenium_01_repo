package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.shoppersstack.com/");
		//driver.findElement(By.id("loginBtn")).click();
		List<WebElement> ToCart = driver.findElements(By.xpath("//button[@id='addToCart']"));
		ToCart.get(1).click();
		//System.out.println(ToCart.size());

	}

}
