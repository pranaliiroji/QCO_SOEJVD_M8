package TestNG_Groups;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void samp1()
	{
		System.out.println("Hii");
	}
	@Test (groups="smoke")
	public void samp2()
	{
		System.out.println("Hello");
	}
}
