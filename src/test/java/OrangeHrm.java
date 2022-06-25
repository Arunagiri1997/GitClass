import org.demo.baseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrm extends baseClass{
	public OrangeHrm() {
		PageFactory.initElements(driver,this);
	}
		@FindBy(id="txtUsername")
		private WebElement uName;
		
		@FindBy(id="txtPassword")
		private WebElement upas;
		@FindBy(id="btnLogin")
		private WebElement login;
		public WebElement getuName() {
			return uName;
		}
		public WebElement getUpas() {
			return upas;
		}
		public WebElement getLogin() {
			return login;
		}
		
		public  void LoginHrm(String text,String pass) {
			sendValue(getuName(), text);
			sendValue(getUpas(), pass);
			click(login);

		}

		
		
		
		
		
		
		
	}
	
	
	
	
	

}
