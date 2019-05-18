package iOSTest;



import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

import com.mobile.MobileTest.*;

public class TestApp {
	
	
	
	@Test
	public void Test() throws MalformedURLException, InterruptedException {
		DriverFactory.iOS_LaunchApp();
	//	No logre validar por Xcode los locations, tengo windows.
		}
	
	@AfterTest
	public void TearDown() {
		DriverFactory.CloseApp();
	}
	
}


