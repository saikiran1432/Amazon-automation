package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	
	
	public static void main(String[] args) {
		
	
	
	WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vidagots\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2FIndia-at-Amazon%2Fb%2Fref%3Dnav_signin%3Fnode%3D13153885011&switch_account=");
	driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	
	//driver.findElement(By.className("nav-action-inner")).click();
	
	String username = Excell.readData("Sheet1",4,1);
	System.out.println(username);
	String password = Excell.readData("Sheet1", 4, 2);
	System.out.println(password);
	driver.findElement(By.id("ap_email")).sendKeys(username);
	driver.findElement(By.id("ap_password")).sendKeys(password);
	driver.findElement(By.id("signInSubmit")).click();
	String product = Excell.readData("Sheet1",4,3);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
	driver.findElement(By.className("nav-input")).click();
	
	
	//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[1]/div[1]/div/div/div/div[2]/div[2]/div/div[1]/h2/a/span")).click();
	
	driver.findElement(By.xpath("//a//span[text()='Xiaomi Mi A2 64GB + 4GB RAM, Dual Camera, LTE AndroidOne Smartphone - International Global Version (Black)']")).click();
	
	//driver.findElement(By.className("a-size-base-plus a-color-base a-text-normal")).click();
	//driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//span[@contains(text(),'Xiaomi Mi A2 64GB + 4GB RAM, Dual Camera')]")).click();
	
	
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-31-announce']")).click();
	String add1 = Excell.readData("Sheet1",4,4);
	driver.findElement(By.name("enterAddressAddressLine1")).sendKeys(add1);
	String add2 = Excell.readData("Sheet1",4,5);
	driver.findElement(By.name("enterAddressAddressLine2")).sendKeys(add2);
	

		JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,500)"); 
		 

	
	
				String city = Excell.readData("Sheet1",4,6);
	driver.findElement(By.id("enterAddressCity")).sendKeys(city);
	String state = Excell.readData("Sheet1",4,7);
	driver.findElement(By.name("enterAddressStateOrRegion")).sendKeys(state);	
	
	driver.findElement(By.xpath("//input[@id='enterAddressPostalCode']")).sendKeys("500049");
	
	WebElement drop =driver.findElement(By.name("enterAddressCountryCode"));
	Select dropdown= new Select(drop);
	dropdown.selectByVisibleText("India");
	driver.findElement(By.name("enterAddressPhoneNumber")).clear();
	driver.findElement(By.name("enterAddressPhoneNumber")).sendKeys("9652162662");
	jse.executeScript("window.scrollBy(0,500)");
	driver.findElement(By.xpath("//input[@class='a-button-text submit-button-with-name']")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[2]/div/div[1]/div/div/a")).click();
	driver.findElement(By.xpath("//input[@testid='delete-item-B07FMPVBQR']")).click();
	
	driver.findElement(By.className("nav-logo-link")).click();
	
	
	
	
	//driver.close();
	}
}
