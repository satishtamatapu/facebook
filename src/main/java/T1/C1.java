package T1;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import Allpages.loginPage;
import BaseP.BaseC;

import org.testng.annotations.*;

public class C1  extends loginPage{

@BeforeTest
public static void BeforeTest()
{
	System.out.println("Before test");
	browserInitzation(BaseC.browser,BaseC.URL);
}

@AfterTest
public static void AfterTest()
{
	System.out.println("After test");
	
}

@org.testng.annotations.BeforeClass
public static void BeforeClass()
{
	System.out.println("Before class");
}
@Test(priority=1)
public static void Test2()
{
	System.out.println("Test case 2");
}

@org.testng.annotations.BeforeMethod
public static void BeforeMethod()
{
	System.out.println("Before Method");
}

@Parameters({"username","password"})
@Test(invocationCount=1,priority=2)
public static void Test1(String username,String password)
{
	System.out.println("Test case 1");
	Enter_email(username,loginPage.EMailInput);
	//ExtentCucumberAdapter.addTestStepLog("user successfully enetred the username  "+username);
	Enter_password(password,loginPage.EMailpassword);
	//ExtentCucumberAdapter.addTestStepLog("user successfully enetred the password  "+password);
}
@AfterMethod
public static void AfterMethod()
{
	System.out.println("After Method");
}
@AfterClass

public static void AfterClass()
{
	System.out.println("After class");
}

}
