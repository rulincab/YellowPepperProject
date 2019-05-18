package androidTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.mobile.MobileTest.MobileDriver;
import io.appium.java_client.touch.WaitOptions;

public class HomePage {

	
	private final static By CALCULAR_BUTTON = By.id("com.eliasnogueira.trianguloapp:id/btnCalcular");
	private final static By ONE_SIDE = By.id("txtLado1");
	private final static By TWO_SIDE = By.id("txtLado2");
	private final static By THREE_SIDE = By.id("txtLado3");
	private static final By MESSAGE = By.id("txtResultado");
	
	
	public WebElement executeCalcular() {
	        return MobileDriver.getDriver().findElement(CALCULAR_BUTTON);
	    }
	
	public void executeCalcularButton() throws InterruptedException  {
		executeCalcular().click();
    }
	
	public void setOneSide(String SideOne) {
        MobileDriver.getDriver().findElement(ONE_SIDE).sendKeys(SideOne);
    }
	
	public void setTwoSide(String SideTwo) {
        MobileDriver.getDriver().findElement(TWO_SIDE).sendKeys(SideTwo);
    }
	
	public void setThreeSide(String SideThree) {
        MobileDriver.getDriver().findElement(THREE_SIDE).sendKeys(SideThree);
    }
	
	public void waitMoment() {
		WaitOptions.waitOptions(Duration.ofSeconds(2));
	}

	public String getMessage() {
		MobileDriver.getDriver().findElement(MESSAGE).getText();
		return null;
	}
	
	
}
