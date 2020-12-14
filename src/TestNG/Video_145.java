package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Video_145 {

	//public static void main(String[] args) { // We don't need this because TestNG uses it in the background
		
//}
	
	@Test(groups= {"Smoke"})                       // What ever follows after this anotation(@Test) will be recognized as a test-case by TestNG
	public void Demo()
	{
		System.out.println("Here Test-cases should be written");// AUTOMATION // Test
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Here Test-case 2 should be written");
	}
	
	@BeforeTest
	public void prerequisites()
	{
		System.out.println("pre-requisites");
	}
	
	
	

}
