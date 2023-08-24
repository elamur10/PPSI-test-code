package qa.test;

import org.testng.TestNG;

import utils.SuiteListener;

public class TestRunner {
	
	static TestNG testNg;

	public static void main(String[] args) {
		
		SuiteListener ext=new SuiteListener();
		testNg=new TestNG();
		testNg.setTestClasses(new Class[] {TestCase2.class});
		testNg.addListener(ext);
		testNg.run();
		
		

	}

}
