package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver webDriver;
    @FindBy(id="uid")
    WebElement username;

    @FindBy(id="passw")
    WebElement password;

    @FindBy(name="btnSubmit")
    WebElement loginButton;

    public LoginPage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    public void setUsername(String userName){
        username.sendKeys(userName);
    }

    public void setPassword(String passWord){
        password.sendKeys(passWord);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void login(String strUsername,String strPassword){
        this.setUsername(strUsername);
        this.setPassword(strPassword);
        this.clickLoginButton();
    }

}
