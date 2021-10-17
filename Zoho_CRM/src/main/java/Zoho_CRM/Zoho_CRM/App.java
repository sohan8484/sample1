package Zoho_CRM.Zoho_CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.genericUtils.WebDriverUtility;

/**
 * Hello world!
 *
 */
public class App 
{
 @Test
 public void naukri() {
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.naukri.com/");
	 WebDriverUtility wb = new WebDriverUtility();
	 wb.switchToWindow(driver, "naukri.com");
 }
}
