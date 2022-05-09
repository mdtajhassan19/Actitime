package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;
import com.actitime.generics.BaseClass;
import com.actitime.pom.Loginpage;

public class CustomerModule extends BaseClass{
	@Test
	public void testCreateModule()
	{
		Reporter.log("Create module",true);
		Loginpage l=new Loginpage(driver);
		l.setLogin("admin", "manager");
	}
}
