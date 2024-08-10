package dropdownsorlistbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement GetAllOption = driver.findElement(By.id("cars"));
		Select AllOptions = new Select(GetAllOption);
		List<WebElement> CarsList = AllOptions.getOptions();
		
		System.out.println(CarsList.size());
		
		for(WebElement Cars : CarsList)
		{
			System.out.println(Cars.getText());
		}

	}

}
