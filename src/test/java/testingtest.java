import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testingtest {


WebDriver _globalDriver;

@BeforeTest
public void setUp(){
    _globalDriver = new ChromeDriver();
    _globalDriver.get("https://www.aruodas.lt/");
}

@AfterTest
public void afterTest(){
    _globalDriver.close();
}

@Test
public void test1() {
    _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]"));
    cookieButton.click();
    WebElement searchButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/ul/li[1]"));
    searchButton.click();
    WebElement dropDownObjectType = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div"));
    dropDownObjectType.click();
    WebElement objectType = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/ul/li[2]/label"));
    objectType.click();
    try {
        TimeUnit.SECONDS.sleep(5);// palaukiam 35 sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement dropDownRegion = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/label"));
    dropDownRegion.click();
    WebElement region = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/ul/li[5]/label"));
    region.click();
    try {
        TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement dropDownCity = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[3]/div/div/div"));
    dropDownCity.click();
    WebElement city = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[3]/div/div/div/div/ul/li[2]/label"));
    city.click();
    WebElement dropDownStreet = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[7]/div/a/span[1]"));
    dropDownStreet.click();
    try {
        TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    _globalDriver.switchTo().frame("fancybox-frame");
    //_globalDriver.findElement(By.id("cbCheckAll")).click();
    WebElement street1 = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/label[68]/input"));
    street1.click();
    WebElement street2 = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[2]/label[329]/input"));
    street2.click();
    WebElement saveButton = _globalDriver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div"));
    saveButton.click();
    try {
        TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    WebElement searchButton2 = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[4]/div[3]/div[1]/input"));
    searchButton2.click();
}
}
