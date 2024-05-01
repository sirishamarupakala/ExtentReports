package testcases;

import org.testng.annotations.Test;



public class Testmodule1 {
	
	

	@Test(priority=1)
	public void testcase1()
	{
		
		System.out.println("executed test case 1");
	}
	@Test(priority=2)
	public void testcase2()
	{
		System.out.println("executed test case 2");
	}
	@Test(priority=3)
	public void testcase3()
	{
		System.out.println("executed test case 3");
	}
	
	@Test(priority=4)
	public void testcase4()
	{
		System.out.println("executed test case 4");
	}
	
	
}
