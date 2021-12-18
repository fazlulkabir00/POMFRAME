package wrapper;

import java.io.IOException;
import java.sql.Wrapper;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWrapper implements WrapperMethods {

public static ChromeDriver driver;
	
	public void invokeApp(String url) throws IOException  {
		try {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\fazlu\\eclipse-workspace\\SeleniumProject\\drivernew\\chromedriver.exe");//change path as per your driver
			 driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The chrome browser launched successfully");
			
			}catch(Exception e){
			System.err.println("The chrome browser not launched");
			}
			
			finally {
				takesnap();
			}
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public void enterByCssSelector(String CssValue, String data) {
		// TODO Auto-generated method stub
		
	}

	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		
	}

	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub
		
	}

	public void clickById(String id) {
		// TODO Auto-generated method stub
		
	}

	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		
	}

	public void clickByName(String name) {
		// TODO Auto-generated method stub
		
	}

	public void clickByLinkText(String text) {
		// TODO Auto-generated method stub
		
	}

	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	public void clickByCssSelector(String CssValue) {
		// TODO Auto-generated method stub
		
	}

	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectByVisibleTextByName(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
		
	}

	public void selectIndexByName(String name, int Value) {
		// TODO Auto-generated method stub
		
	}

	public void selectByValueById(String id, String value) {
		// TODO Auto-generated method stub
		
	}

	public void selectByValueByName(String name, String value) {
		// TODO Auto-generated method stub
		
	}

	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	}

	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	public void takesnap() throws IOException {
		// TODO Auto-generated method stub
		
	}

	public void quitBrowser() {
		// TODO Auto-generated method stub
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	
}
