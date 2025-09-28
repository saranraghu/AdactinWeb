package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {
	
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement UserName = driver.findElement
				(By.name("username"));
		UserName.sendKeys("Saran");
		
		WebElement Pswd = driver.findElement
				(By.name("password"));
		Pswd.sendKeys("1234");
	
	
	}

}
