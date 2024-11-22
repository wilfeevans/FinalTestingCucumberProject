package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeMethod;



public class Base 
{
	@BeforeMethod
   public Properties setUp() throws IOException
	{
	
	   //Logger log= Logger.getLogger(Base.class);
	   //PropertyConfigurator.configure("./src/test/resources/Properties/log4j.properties");
	  
	   FileInputStream fis= new FileInputStream("./src/test/resources/Properties/Config.properties");
	   Properties prop= new Properties();
	   prop.load(fis);
	  // log.info("Property file is loaded");
	   return prop;	
		
	}

}
