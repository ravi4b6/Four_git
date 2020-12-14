package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Home_loan {
	
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@AfterSuite
	public void AFsuite()
	{
		System.out.println("This text will be displayed at the end of the suite"); 
	}
	
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
		
	}
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("This text will be printed before the whole xml file");
		
	}
	
	@Test(groups= {"Smoke"})
	public void ApiLoginHomeLoan()
	{
		System.out.println("APIloginHomeLoan");
	}

}
