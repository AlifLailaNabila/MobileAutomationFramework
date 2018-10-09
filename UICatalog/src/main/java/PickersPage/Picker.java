package PickersPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/15/17.
 */
public class Picker extends Base {
    public void selectPickerTwoWheels(String name, String number){
        //scrollKeys(ad, new String[]{name,number});
        //XCUIElementTypeButton[@name="UIPicker"]
        //XCUIElementTypeButton[@name="UIDatePicker"]
        //XCUIElementTypeButton[@name="Custom"]
    }
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIPicker\"]")
    public static WebElement UIPickerButton;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"UIDatePicker\"]")
    public static WebElement UIDatePickerButton;
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Custom\"]")
    public static WebElement customButton;

    //XCUIElementTypeToolbar[@name="Toolbar"]

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAToolbar[1]/UIASegmentedControl[1]/UIAButton")
    List<WebElement> segmentControl = new ArrayList<WebElement>();

    public void getUIPicker(){
        segmentControl.get(5).click();
    }
    public void getUIDatePicker(){
        segmentControl.get(1).click();
    }
    public void getCustom(){
        segmentControl.get(2).click();
    }


}
