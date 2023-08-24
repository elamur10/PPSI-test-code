package utils;

import java.util.Collection;
import java.util.Set;

import org.testng.IConfigurationListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;


public class ConfigListener implements IConfigurationListener,ITestListener {
	
	/*public void onConfigurationSuccess(ITestContext context) 
	{
		
		Collection<ITestNGMethod> methods=context.getPassedConfigurations().getAllMethods();
		for(ITestNGMethod method:methods)
		{
			System.out.println(method.getMethodName());
		}
		
		
	}*/
	
	public void onConfigurationSuccess(ITestResult result) 
	{
		
		String name=result.getName();
		//System.out.println(name);
		
		
		
		
	}
}

	


