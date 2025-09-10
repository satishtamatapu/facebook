package T1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C3 {
	
	
	public static void login()
	{
		System.out.println("login code");
	}

	public static void main(String[] args) {
	
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.fb.com");
		 SoftAssert  Sa= new SoftAssert();	 
		 String actualtitle=driver.getTitle();
		 String Expectedtitle="Facebook – log in or sign";
		 //Assert.assertEquals(actualtitle, Expectedtitle);//hard assert
		 WebElement Ele=driver.findElement(By.id("email"));
		 
		 Sa.assertTrue(!Ele.isDisplayed(), "inputemail is not display");
		
		 login();
		 Sa.assertAll();//print all issues occur
		 
		

	}

}
