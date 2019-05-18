package androidTest;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.testng.annotations.*;
import com.mobile.MobileTest.*;


public class TestApp {
	
	
	@Test
	public void Test() throws MalformedURLException, InterruptedException {

		DriverFactory.Android_LaunchApp();
		HomePage homepage = new HomePage();
		homepage.executeCalcularButton();
		String responseMessage = homepage.getMessage(); 
		Assert.assertEquals("Preencha todos os campos",responseMessage,"el mensaje es el esperado");
		//Thread.sleep(10000);
	}
	@Test
	public void Test1() throws MalformedURLException, InterruptedException {

		DriverFactory.Android_LaunchApp();
		HomePage homepage = new HomePage();
		homepage.executeCalcularButton();
		homepage.setOneSide("5");
		String responseMessage = homepage.getMessage(); 
		Assert.assertEquals("Preencha todos os campos",responseMessage,"el mensaje es el esperado");
		}
			
	@Test
	public void Test2() throws MalformedURLException, InterruptedException {
		DriverFactory.Android_LaunchApp();
		HomePage homepage = new HomePage();
		homepage.executeCalcularButton();
		homepage.setOneSide("5");
		homepage.setOneSide("5");
		homepage.setOneSide("5");
		String responseMessage = homepage.getMessage(); 
		Assert.assertEquals("O triângulo é Equilátero",responseMessage,"el mensaje es el esperado");
	
	}
	
	@Test
	public void Test3() throws MalformedURLException, InterruptedException {
		DriverFactory.Android_LaunchApp();
		HomePage homepage = new HomePage();
		homepage.executeCalcularButton();
		homepage.setOneSide("5");
		homepage.setOneSide("5");
		homepage.setOneSide("2");
		String responseMessage = homepage.getMessage(); 
		Assert.assertEquals("O triângulo é Isósceles",responseMessage,"el mensaje es el esperado");
	
	}
	
	@AfterTest
	public void TearDown() {
		DriverFactory.CloseApp();
	}
}
