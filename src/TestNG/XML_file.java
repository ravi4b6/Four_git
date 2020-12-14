package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XML_file {
	
	@Parameters({"URL"})
	@Test                       // What ever follows after this anotation(@Test) will be recognized as a test-case by TestNG
	public void Demo1(String URL)
	{
		System.out.println("Demo1");// AUTOMATION // Test
		System.out.println(URL);
		//System.out.println(Key);
	}
	
	@Parameters({"URL"}) // applying parameter to this method
	@Test
	public void example(String URL)
	{
		System.out.println("Example");
		System.out.println(URL);
	}
	
	@Test(dependsOnMethods={"Demo1","example"}) // want to run this method after "Demo" method
	public void Begin()
	{
		System.out.println("This shoud be printed after 'Demo' and 'example'methods and the name of this method is 'Begin'");
	}
	
	
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
		System.out.println("Here Test-case 2 should be written");
	}
	
	@Test(enabled=false)
	public void issue()
	{
		System.out.println("error");
	}

}
