package PageFactory;

import Pages.Home;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class HomePageTest {

    WebDriver webDriver;
    HomePage hPage;
    LoginPage lPage;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://www.testfire.net/login.jsp");
    }

    @Test
    public void check_Login_Success() {
//        hPage = new HomePage(webDriver);
        lPage = new LoginPage(webDriver);
        lPage.login("admin","admin");
        hPage = new HomePage(webDriver);
        String loginText = hPage.getHomePageText();
        assertEquals("Congratulations!",loginText);
    }
}