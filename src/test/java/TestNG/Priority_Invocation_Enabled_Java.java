package TestNG;

import org.testng.annotations.Test;

public class Priority_Invocation_Enabled_Java {
@Test(priority=-5,invocationCount=3)
public void demo1()
{
	System.out.println("hi demo1");
}


@Test(priority=1,invocationCount=2, enabled=false)
public void demo2()
{
	System.out.println("hi demo2");
}

@Test(priority=-1,invocationCount=5)
public void demo3()
{
	System.out.println("hi demo3");
}
	

}
