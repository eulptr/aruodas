import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class testingtest {


    WebDriver _globalDriver;

    @BeforeTest
    public void setUp() {
        _globalDriver = new ChromeDriver();
        _globalDriver.get("https://www.aruodas.lt/");
    }
/*
@AfterTest
public void afterTest(){
    _globalDriver.close();
}*/

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

    @Test
    public void test2() {
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]"));
        cookieButton.click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[8]/div/div[10]/div/div/div/div[2]/div[2]/div[1]/a")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/form/div[1]/div[2]/input")).sendKeys("e.skelaite");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/form/div[2]/div[2]/input")).sendKeys("Kamuolys55");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/form/button")).click();
        try {
            TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String notRegistrated = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[2]/div/div/form/div[1]")).getText();
        Assert.assertEquals(notRegistrated, "Neteisingas el. pašto adresas");
        //siuo atveju testas pass'ina, jeigu butu expected "Registracija sekminga", tuomet testas fail'intu
    }

    @Test
    public void test3() {
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]"));
        cookieButton.click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/div")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[2]/ul/li[3]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[3]/ul/li[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/input[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[3]/span[1]/ul[2]/li[48]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/input[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[5]/li[1]/input")).sendKeys("Vinksnen");
        try {
            TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[4]/span[1]/ul[5]/li[478]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/input[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[5]/li[1]/input")).sendKeys("Vin");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[6]/span[1]/ul[5]/li[55]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[7]/div/div/label/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[11]/div[2]/div/label/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[13]/span[2]/input")).sendKeys("6");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[16]/div/div[1]/label/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[26]/div/div[1]/textarea")).sendKeys("Pardodu sklipa");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[33]/span[2]/input")).sendKeys("20000");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[34]/span[1]/input")).sendKeys("63222408");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[35]/span[1]/input")).sendKeys("e.skelaite@gmail.com");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[38]/span[1]/div/div/label/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/form/ul/li[39]/a")).click();
        try {
            TimeUnit.SECONDS.sleep(5);// palaukiam X sec kol puslapis uzsikraus, stabdomas testas, ne narsykle

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String uploaded = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/span")).getText();
        Assert.assertEquals(uploaded, "Paslaugų paketo pasirinkimas");
    }

    @Test
    public void test4() {
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]"));
        cookieButton.click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/ul/li[1]/a")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/span[1]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[1]/div/div/div/div/ul/li[5]/label")).click();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div/ul/li[4]/label")).click();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[1]/div/div/span[1]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[1]/div/div/div/ul/li[1]/label/input")).click();
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/label/input")).sendKeys("100");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[1]/div[2]/div[4]/div/div[2]/label/input")).sendKeys("700");
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/form/div/div[1]/div/div[4]/div[3]/div[1]/input")).click();
    }

    @Test
    public void test5() {
        _globalDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[9]/div[2]/div/div[1]/div/div[2]/div/button[2]"));
        cookieButton.click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[2]/ul/li[1]/a")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div/ul/li[3]/a")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/div/div/div[1]/div/div/div")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/div/div/div[1]/div/div/div/div/ul/li[1]/label")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/div/div/div[2]/div/div/div")).click();
        _globalDriver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div/div/div/div[2]/div/div/div/div/ul/li[5]/label")).click();


    }
}
