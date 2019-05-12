import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.util.UUID;



public class Testiki {
    WebDriver driver;
    String Skazke = "Skazke";
    String Phone = "Phone";




        @Test
        public void someSimpleTest(){

            UUID uuid = UUID.randomUUID();
            String P = Phone + uuid;
            String expectedTitle = "App Students";
            driver = new ChromeDriver();
            driver.get("http://37.59.228.229:3000/");
            String title = driver.getTitle();
            Assert.assertEquals(expectedTitle, title);
            driver.findElement(By.cssSelector("a.add-user")).click();
            driver.findElement(By.cssSelector("input#icon_prefix")).clear();
            driver.findElement(By.cssSelector("input#icon_prefix")).sendKeys("Petya");
            driver.findElement(By.cssSelector("input#icon_telephone")).clear();
            driver.findElement(By.cssSelector("input#icon_telephone")).sendKeys(P);
            driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > a")).click();
            Assert.assertTrue (driver.getPageSource().contains("Phone13404759-29ca-4332-ada8-927470b527c1"));
            if(driver.getPageSource().contains("Phone13404759-29ca-4332-ada8-927470b527c1"))
            {
                System.out.println("Yes");
            }

            else
            {
                System.out.println("No");
            }




        }
        @After

    public void postTiasi(){
        driver.quit();
        }

    }

