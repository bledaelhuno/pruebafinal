package Pruebas_Banco_Falabella;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PruebaPagFalabella {
    static WebDriver driver;

    public static void main (String [] args){
        String OpenDriver = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
        String Openinternet = System.getProperty("user.dir") + "\\Drivers\\IEDriverServer.exe";
        String baseURL = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver",OpenDriver);
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();

            try {
            driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div > div.RNNXgb > div > div.a4bIc > input")).sendKeys("falabella");
            driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
            driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3 > div")).click();
            WebElement campobuscar = driver.findElement(By.cssSelector("#searchQuestionSolr"));
            campobuscar.sendKeys("celular y9 2019");
            campobuscar.sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("//*[@id=\"all-pods\"]/div[1]/div[3]/a")).click();
                Select garantia = new Select(driver.findElement(By.xpath("//*[@id=\"fbra_browseMainProduct\"]/div/div/div[3]/div/div[5]/div[2]/div/div[1]")));
                garantia.getFirstSelectedOption();
                WebDriverWait wait = new WebDriverWait(driver, 60);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#fbra_browseMainProduct > div > div > div:nth-child(3) > div > div.fb-product-cta__controls--actions.fb-product-cta__controls--actions-pdp > button")));

            driver.findElement(By.cssSelector("#fbra_browseMainProduct > div > div > div:nth-child(3) > div > div.fb-product-cta__controls--actions.fb-product-cta__controls--actions-pdp > button")).click();




    } finally {
                driver.quit();
            }
            }

    }
