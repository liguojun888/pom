package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
    WebDriver webDriver;
    By titleText = By.xpath("//*[@id=\"_ctl0__ctl0_Content_Main_promo\"]/table/tbody/tr[1]/td/h2");

    public Home(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public String getTitleText(){
        return webDriver.findElement(titleText).getText();
    }
}
