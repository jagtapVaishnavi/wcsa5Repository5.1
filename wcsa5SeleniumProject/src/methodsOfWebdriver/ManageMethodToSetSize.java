package methodsOfWebdriver;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethodToSetSize {
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	Dimension d= new Dimension(500,400);
	driver.manage().window().setSize(d);
	
	Thread.sleep(2000);
	driver.close();
}
}
