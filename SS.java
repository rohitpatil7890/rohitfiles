import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(3000);
		
		WebElement Reg=driver.findElement(By.partialLinkText("here"));
		System.out.println("title of the :"+ driver.getTitle());
		
		
//		driver.findElement(By.id("txtUser")).sendKeys("APPROVESTATE");
//		Thread.sleep(3000);
//		driver.findElement(By.id("txtPass")).sendKeys("Pass@123");
//		Thread.sleep(3000);
//		driver.findElement(By.id("btnLogin")).click();
//		Thread.sleep(3000);
//		
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		
//		WebElement clickOnreport=driver.findElement(By.xpath("//a[normalize-space()='Report']"));
//		
//		
//		js.executeScript("arguments[0].click();",clickOnreport);
//		Thread.sleep(2000);
//		
//		//js.executeScript("alert('welcome to daynulm');");
//		
//		js.executeScript("window.scrollBy(0,-600)");
//		
//		
		
		
		
		
		
		
	}

}
