package TestData;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;

public class testdata {
	public static Properties property;
	private static String configpath="Congifuration/configsetting.properties";
	
	public static void initializePropertyFile()
	{
		property=new Properties();
		try {
			
			InputStream instm=new FileInputStream(configpath);
			property.load(instm);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	

}
