package NoPOM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class NoPOMTest {
    @Test
    public void check_Login_Success(){
        System.setProperty("webdriver.chrome.driver","E:/2656705285/FileRecv/软件测试作业/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://www.testfire.net/login.jsp");
        webDriver.findElement(By.id("uid")).sendKeys("admin");
        webDriver.findElement(By.id("passw")).sendKeys("admin");
        webDriver.findElement(By.name("btnSubmit")).click();
        String actual = webDriver.findElement(By.xpath("//*[@id=\"_ctl0__ctl0_Content_Main_promo\"]/table/tbody/tr[1]/td/h2")).getText();
        assertEquals("Congratulations!",actual);
    }

}