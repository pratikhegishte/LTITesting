package CodilityPractice;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestgooglePage {
		static WebDriver driver;
		@BeforeClass
		public static void beforeClass() {
			System.setProperty("webdriver.chrome.driver","C:\\ItLearning\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://ww.google.com");
		}
		@Test
		public void TC1() {
			String actTitle=driver.getTitle();
			Assert.assertEquals("Google", actTitle);
		}
		
		@Test 
		public void  TC3() {
			String actTitle=driver.getTitle();
			driver.findElement(By.name("search-button")).click();
			Assert.assertTrue(driver.getTitle().contains("Gooogle"));
		}

@AfterClass 
public static void afterClass() {
	driver.quit();
}
}