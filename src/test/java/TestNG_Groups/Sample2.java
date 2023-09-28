package TestNG_Groups;

import org.testng.annotations.Test;

public class Sample2 {
	@Test (groups="smoke")
	public void samp1()
	{
		System.out.println("java");
	}
	@Test 
	public void samp2()
	{
		System.out.println("selenium");
	}
}
