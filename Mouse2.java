package moveByOffset;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Mouse2{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
WebElement e = driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));		
	Point p = e.getLocation();	
	int x = p.x;
	int y = p.y;
	Actions act = new Actions(driver);
		act.moveByOffset(x, y).perform();
		
	}
}
