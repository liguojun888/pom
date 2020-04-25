package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver webDriver;
    By userName = By.id("uid");
    By password = By.id("passw");
    By loginButton = By.name("btnSubmit");

    public Login(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void setUserName(String strUserName){
        webDriver.findElement(userName).sendKeys(strUserName);
    }

    public void setPassword(String strPassword){
        webDriver.findElement(password).sendKeys(strPassword);
    }

    public void clickButton(){
        webDriver.findElement(loginButton).click();
    }

    public void login(String strUserName,String strPassword){
        this.setUserName(strUserName);
        this.setPassword(strPassword);
        this.clickButton();
    }
}
