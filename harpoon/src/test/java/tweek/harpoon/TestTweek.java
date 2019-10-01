package tweek.harpoon;

import org.testng.annotations.Test;

public class TestTweek 
{
@Test
public void getName()
{
	System.out.println("this is tweek test");
}

@Test(priority = 1)
public void getAddress()
{
	System.out.println("this is to print the address");
}

@Test(priority = 2)
public void getSalary()
{
	System.out.println("this is to print the salary123");
}

@Test(priority = 3)
public void getBank()
{
	System.out.println("this is to print the respective bank details");
}
}
