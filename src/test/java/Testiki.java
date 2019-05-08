import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;


public class Testiki {
    WebDriver driver;


        @Test
        public void someSimpleTest(){
            String expectedTitle = "App Students";
            driver = new ChromeDriver();
            driver.get("http://37.59.228.229:3000/");
            String title = driver.getTitle();
            Assert.assertEquals(expectedTitle, title);
            driver.findElement(By.cssSelector("a.add-user")).click();
            driver.findElement(By.cssSelector("input#icon_prefix")).clear();
            driver.findElement(By.cssSelector("input#icon_prefix")).sendKeys("IVAN");
            driver.findElement(By.cssSelector("input#icon_telephone")).clear();
            driver.findElement(By.cssSelector("input#icon_telephone")).sendKeys("8888888888888");
            driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > a")).click();


        }
        @After
    public void postTiasi(){
        driver.quit();
        }

    }

