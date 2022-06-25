import org.demo.baseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class AssertExample extends baseClass {
	@Test
	public void tc1() {
browserLaunch();
loadUrl("https://adactinhotelapp.com/BookingConfirm.php");
maximize();
String url = currentUrl();
boolean contains = url.contains("adt");
System.out.println(contains);
String title = driver.getTitle();
System.out.println(title);

Assert.assertTrue(contains);
WebElement element = driver.findElement(By.id("username"));
element.sendKeys("giri");
String attribute = element.getAttribute("value");
Assert.assertEquals(title, "adactin hotel");




	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
