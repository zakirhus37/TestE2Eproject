package Academy;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
public WebDriver driver;	
public WebDriver Initializebrowser() throws IOException
{
	Properties prop=new Properties();
	FileInputStream fis= new FileInputStream("C:\\Users\\Zakir\\OwnProject\\E2Eproject\\Resources\\browser.properties");
	
	prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
    System.setProperty("webdriver.chrome.driver","D:\\Selenium Prerequisite\\chromedriver.exe");
    driver=new ChromeDriver();
}
else if(browserName.equals("firefox"))
{
	System.setProperty("webdriver.gechodriver.driver","D:\\Selenium Prerequisite\\geckodriver.exe");
	driver=new ChromeDriver();
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;

}
}
