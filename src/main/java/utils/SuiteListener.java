package utils;

import java.io.File;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.ITestAnnotation;

import base.BaseTest;


public class SuiteListener implements ITestListener,IAnnotationTransformer{


	
	public void onTestFailure(ITestResult result)
	{
	
		/*String filename=System.getProperty("user.dir")+File.separator+"screenshots"+File.separator+result.getMethod().getMethodName();
		File f1=((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f1, new File(filename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		Date currentdate=new Date();
		String screenshotfilename=currentdate.toString().replace(" ", "_").replace(":", "_");
		File f1=((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f1,new File(".//screenshots/"+screenshotfilename+"_FAIL.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
		
		public void onTestSuccess(ITestResult result)
		{
		
			
			Date currentdate=new Date();
			String screenshotfilename=currentdate.toString().replace(" ", "_").replace(":", "_");
			File f1=((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(f1,new File(".//screenshots/"+screenshotfilename+"_PASS.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}	
	}


	public void onFinish(ITestContext context)
		
		{
			/*for (ITestNGMethod testMethodName : context.getAllTestMethods())
	        {
	            String testMethod = testMethodName.getMethodName();
	           

	            if (testMethod.contains(testname))
	            {
	                if (context.getPassedTests().size() > 0)
	                {
	                    context.getPassedTests().removeResult(testMethodName);
	                }
	                if (context.getFailedTests().size() > 0)
	                {
	                    context.getFailedTests().removeResult(testMethodName);
	                }
	                if (context.getSkippedTests().size() > 0)
	                {
	                    context.getSkippedTests().removeResult(testMethodName);
	                }
	            }
	        }*/
		
		Collection<ITestNGMethod> passedmethods=context.getPassedConfigurations().getAllMethods();
		for(ITestNGMethod passedmethod:passedmethods)
			{
			String test=passedmethod.getMethodName();
            if(test.equals("method1")||test.equals("method2")||test.equals("method3")||test.equals("method4"))
		{
			
			context.getPassedConfigurations().removeResult(passedmethod);
		}
	    
			
		}
	
	Collection<ITestNGMethod> failedmethods=context.getFailedConfigurations().getAllMethods();
	for(ITestNGMethod failedmethod:failedmethods)
		{
		String failedtest=failedmethod.getMethodName();
        if(failedtest.equals("method1")||failedtest.equals("method2")||failedtest.equals("method3")||failedtest.equals("method4"))
	{
		
		context.getPassedConfigurations().removeResult(failedmethod);
	}
    
		
	}
	
	Collection<ITestNGMethod> skippedmethods=context.getSkippedConfigurations().getAllMethods();
	for(ITestNGMethod skippedmethod:skippedmethods)
		{
		String skippedtest=skippedmethod.getMethodName();
        if(skippedtest.equals("method1")||skippedtest.equals("method2")||skippedtest.equals("method3")||skippedtest.equals("method4"))
	{
		
		context.getPassedConfigurations().removeResult(skippedmethod);
	}
    
		
	}
	}


	
	/*public void transform(ITestAnnotation annotation,Class testClass,Constructor testConstructor,Method testMethod)
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
*/
}
