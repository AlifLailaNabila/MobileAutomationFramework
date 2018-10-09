package ControlsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Controls {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")public static WebElement standardSwitch;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]")public static WebElement standardSlider;
    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Custom\"]") public static WebElement customizedSlider;
    public void setStandardSwitch(){
        standardSwitch.click();
    }
    public void setStandarSlider(){
        standardSlider.click();
    }
    public void setCustomizedSlider(){
        customizedSlider.click();
    }

}
