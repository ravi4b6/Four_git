package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Car_loan {

	@Test
	public void WebLoginCarLoan()
	{
		System.out.println("WebLoginCarLoan");
	}
	
	@Parameters({"URL","API_Key/username"})
	@Test
	public void MobileLoginCarLoan(String URL, String Key)
	{
		System.out.println("MobileLoginCarLoan");
		System.out.println(URL);
		System.out.println(Key);
	}
	
	@Test(groups= {"Smoke"})
	public void ApiLoginCarLoan()
	{
		System.out.println("APIloginCarLoan");
	}
	
	@BeforeMethod
	void BfMethod()
	{
		
		System.out.println("BEFORE METHOD");
		
	}
	
	@AfterMethod
	void AfMethod()
	{
		
		System.out.println("AFTER METHOD");
		
	}

	@BeforeClass
	public void BCclass()
	{
		System.out.println("Executes before executing every method in this class");
	}
	
	@AfterClass
	public void AFclass()
	{
		System.out.println("Executes after executing every method in this class");
	}
}
