package baseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void Browsers(String Browser) {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (Browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Browser not found");
		}
		
//		switch (Browser) {
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();	
//		break;
//		case "edge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();						
//			break;
//		default:
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//		}
	}
	
	public static void BrowserURL(String C) {
		driver.get(C);
	}
	
	public static String CurrentTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public static String CurrentURL() {
		 String currentUrl = driver.getCurrentUrl();
		 return currentUrl;			
	}
	
	public static void MaximizeWindow() {
		driver.manage().window().maximize();		
	}
	
	public static void Close() {
		driver.close();
	}
	
	public static void Quit() {
		driver.quit();
	}

	public static void ImplicitlyWait(long C) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(C));
	}
	
	public static void SendKeys(WebElement C , String E) {
		C.sendKeys(E);
	}
	
	public static void Click(WebElement C) {
		C.click();
	}
	
	public static void Clear(WebElement E) {
		E.clear();
	}
	
	public static void Refresh() {
		driver.navigate().refresh();
	}
	
	public static void Forward() {
		driver.navigate().forward();
	}
	
	public static void BackWard() {
		driver.navigate().back();
	}
	
	public static String GetText(WebElement C) {
		String text = C.getText();
		return text;
	}
	
	public static String GetAttribute(WebElement E , String name) {
		String attribute = E.getAttribute(name);
		System.out.println(attribute);
		return attribute;
	}
	
	public static String GetAttributeValue(WebElement C,String value) {//20
		return C.getAttribute(value);
		
	}
	
	public static String GetTagName(WebElement C) {
		String tagName = C.getTagName();
		return tagName;
	}
	
	public static String IsDisplayed(WebElement C) {
		boolean displayed = C.isDisplayed();
		return null;		
	}
	
	public static String IsSelected(WebElement C) {
	    boolean selected = C.isSelected();
		return null;	
	}
	
	
	public static String GetAttributeInnerText(WebElement C , String Text) {//2
		String attributeText = C.getAttribute(Text);
		return attributeText;
	}
	
	public static void ClickHold(WebElement C , WebElement R) {
		Actions A = new Actions(driver);
		A.clickAndHold(C).release(R).perform();
	}
	
	public static void MoveElement(WebElement T) {
		Actions A = new Actions(driver);
		A.moveToElement(T).click().build().perform();
	}
	
	public static void MakeDir(String Path) {
		File A = new File(Path);
		boolean mkdir = A.mkdir();
		System.out.println(mkdir);
	}
	
	private void SimpleAlert(String S) {
		WebElement findElement = driver.findElement(By.xpath(S));
		findElement.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	//--------------Select Class------------
	
	public static void SelectIndex(WebElement E , int I) {
		Select S = new Select(E);
		S.selectByIndex(I);
	}
	
	public static void SelecyValue(WebElement E , String S) {
		Select S1 = new Select(E);
		S1.selectByValue(S);
	}
	
	public static void SelectText(WebElement E , String S) {
		Select S2 = new Select(E);
		S2.selectByVisibleText(S);
	}
	
	 public static String GetFirstSelectedOption(WebElement element) {
		 Select S3 = new Select(element);
		 String text = S3.getFirstSelectedOption().getText();
		return text;
		 
		 
		 
//	        return new Select(element).getFirstSelectedOption().getText();
	    }
	
	//-----------ScreenShot--------------
	public static void ScreenShot(WebDriver driver, String Path) throws IOException {
		
		TakesScreenshot S = (TakesScreenshot) driver;
		File screenshotAs = S.getScreenshotAs(OutputType.FILE);
		File PathFile = new File(Path);
		FileUtils.copyFile(screenshotAs, PathFile);
	}
	
	public static String GetWindowHandle(WebElement C) {//24
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		return windowHandle;
	}
	
	public static String GetWindowHandles() {//25
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		return null;
	}	
	
	
	
}
