package TestNG;

import org.testng.annotations.Test;


public class DataProvider {
	
	@Test(dataProvider = "getData")
	public void DataP(String username, String password)
	{
		System.out.println("Data provider test");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	
	
	@org.testng.annotations.DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		// set 1
		data[0][0] = "first row username";
		data[0][1] = "first row password";
		
		// set 2
		data[1][0] = "second row username";
		data[1][1] = "second row password";
		
		// set 3
		data[2][0] = "third row username";
		data[2][1] = "third row password";
		
		return data;
	}

}
