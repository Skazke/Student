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
            WebElement element = driver.findElement(By.id("user-list"));
            System.out.println("Printing " + element.getText());

            System.out.println(P + "     НОВЫЙ АЙДИ!!!");

            Assert.assertEquals("78c7a846-6f33-4130-8238-46004eb017f9",element.getText());
            
            




        }
        @After

    public void postTiasi(){
        driver.quit();
        }

    }

