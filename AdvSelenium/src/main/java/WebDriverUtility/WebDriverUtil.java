package WebDriverUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {
	
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
 		
		}
    public void explicitWait(WebDriver driver,WebElement element) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.visibilityOf(element));
    }
    
    public void scroll(WebDriver driver,WebElement element) {
    	Actions act = new Actions(driver);
    	act.scrollToElement(element).perform();
    }
    public void alertAccept(WebDriver driver) {
    	driver.switchTo().alert().accept();
    }
    public void alertDismiss(WebDriver driver) {
    	driver.switchTo().alert().dismiss();
    }
    public void Dropdown(WebDriver driver,WebElement element,String value) {
    	
    	Select  s = new Select(element);
    	s.selectByValue(value);
    }
    public void WindowHandle(WebDriver driver,WebElement element) {
    	String pw = driver.getWindowHandle();
    	Set<String> ids = driver.getWindowHandles();
    	ids.remove(pw);
    	for(String wIds:ids) {
    		driver.switchTo().window(wIds);	
    	}
    }
    	public void screenshot(WebDriver driver,WebElement element,String ss) throws IOException {
    		
    		TakesScreenshot sc = (TakesScreenshot) driver;
    		File src = sc.getScreenshotAs(OutputType.FILE);
    		File tgt = new File("./AdvSelenium\\errorShots"+ss+".png");
    		org.openqa.selenium.io.FileHandler.copy(src, tgt);
    		
    	
    }
}
