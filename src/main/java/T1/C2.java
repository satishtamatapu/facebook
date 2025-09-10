package T1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C2 {

	@org.testng.annotations.BeforeClass
	public static void BeforeClass2()
	{
		System.out.println("Before class2");
	}
	
	public static void AfterClass2()
	{
		System.out.println("AFter class2");
	}
	
	@Test
	public static void Test2()
	{
		System.out.println("test2");
	}
	@BeforeSuite
	public static void Beforesuite()
	{
		System.out.println("BeforeSuite of C2");
	}
	
	@AfterSuite
	public static void Aftersuite()
	{
		System.out.println("AfterSuite of C2");
	}
	
}
