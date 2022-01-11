package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationThreePage extends PageObject {

    public static final Target MOBILE_DEVICE_INPUT = Target.the("Mobile device input")
            .located(By.xpath("//div[@placeholder='Select Brand']"));

    public static Target mobileDeviceInput(String strMobileDevice){
        return Target.the("Especific mobile device option").locatedBy("//div[contains(text(),'"+ strMobileDevice +"')]");
    }


    public static final Target MODEL_INPUT = Target.the("Mobile device model input")
            .located(By.xpath("//div[@placeholder='Select a Model']"));

    public static Target modelInput(String strModel){
        return Target.the("Especific model option").locatedBy("//div[contains(text(),'"+ strModel +"')]");
    }


    public static final Target OS_INPUT = Target.the("Mobile device operating system input")
            .located(By.xpath("//label[text()='Operating System:']/parent::div/following-sibling::div[@class='ui-select-box']"));

    public static Target osInput(String strOS){
        return Target.the("Specific operating system option")
                .locatedBy("//label[text()='Operating System:']/parent::div/following-sibling::div[@class='ui-select-box']/div/ul/li/div/span/div[text()='"+ strOS +"']");
    }

    public static final Target NEXT_LASTSTEP_BUTTON = Target.the("Button that shows us the last signup form page")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}
