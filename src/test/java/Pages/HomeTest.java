package Pages;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class HomeTest {

    WebDriver webDriver;
    Home home;
    Login login;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://www.testfire.net/login.jsp");
    }

    @Test
    public void check_Login_Success(){
        login = new Login(webDriver);
        login.login("admin","admin");
        home = new Home(webDriver);
        String actual = home.getTitleText();
        assertEquals("Congratulations!",actual);
    }
}