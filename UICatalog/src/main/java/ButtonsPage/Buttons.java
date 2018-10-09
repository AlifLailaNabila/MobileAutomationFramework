package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Buttons extends Base {
 @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]") public static WebElement imageButton;
 @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]") public static WebElement button;
 @FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Buttons\"]") public static WebElement back;

    public void clickbuttons(){
        button.click();
    }
    public void setImageButton(){
        imageButton.click();
    }
    public void checkBackButton(){
        button.click();
        back.click();
    }

}
