package iPhone;

import PickersPage.Picker;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bilal on 24-01-2017.
 */
public class PickerTest extends Base {
//    String[] pickerName = {"Chris Armstrong","3"};
//    String[] pickerDate = {"March","10","2018"};
    Picker picker;
    @BeforeMethod
    public void navigate()throws InterruptedException {
        UiCatalog ui = PageFactory.initElements(ad, UiCatalog.class);
        ui.getPickers();
        picker = PageFactory.initElements(ad, Picker.class);
    }
//    public Picker picker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
//        uiCatalog.getPickers();
//        return PageFactory.initElements(ad,Picker.class);
//    }
//    @Test
//    public void testUIPicker(){
//        //UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
//        //uiCatalog.getPickers();
//        //Picker picker = PageFactory.initElements(ad, Picker.class);
//        picker().getUIPicker();//.selectPickerTwoWheels("Chris Armstrong","3");
//        scrollKeys(ad, pickerName,"//UIAPicker[1]");
//    }
//    @Test
//    public void testDatePicker(){
//        UiCatalog uiCatalog = PageFactory.initElements(ad,UiCatalog.class);
//        uiCatalog.getPickers();
//        Picker picker = PageFactory.initElements(ad, Picker.class);
//        picker().getUIDatePicker();
//        scrollKeys(ad, pickerDate,"//UIAPicker[2]");
//    }
    @Test
    public void pickerTest(){
        picker.UIPickerButton.click();
    }
    @Test
    public void DatePickerTest(){
        picker.UIDatePickerButton.click();
    }
    @Test
    public void customTest(){
        picker.customButton.click();
    }
}
