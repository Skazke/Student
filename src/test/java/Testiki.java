import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.util.List;
import java.util.UUID;



public class Testiki {
    WebDriver driver;
    String Skazke = "Skazke";
    String Phone = "";

    @Before
    public void Before() throws InterruptedException {
        String expectedTitle = "App Students";
        driver = new ChromeDriver();
        driver.get("http://37.59.228.229:3000/");
        Thread.sleep(5000);
        String title = driver.getTitle();
        Assert.assertEquals(expectedTitle, title);

    }

    @Test
    public void someSimpleTest() {
        UUID uuid = UUID.randomUUID();
        String P = Phone + uuid;
        driver.findElement(By.cssSelector("a.add-user")).click();
        driver.findElement(By.cssSelector("input#icon_prefix")).clear();
        driver.findElement(By.cssSelector("input#icon_prefix")).sendKeys("Petygfhhfga");
        driver.findElement(By.cssSelector("input#icon_telephone")).clear();
        driver.findElement(By.cssSelector("input#icon_telephone")).sendKeys(P);
        driver.findElement(By.cssSelector("body > div.row > div.col.s9.main-content > a")).click();
        WebElement element = driver.findElement(By.id("user-list"));
        if (element.getText().contains("fedb6da1-107c-4b43-bad1-98d5ac52839b")) {
            System.out.println(" User YES! ");
        }
        else {
            System.out.println("User With this ID is NO ");
        }
        System.out.println(P);


    }
    @Test
    public  void    AAA (){
        WebElement element = driver.findElement(By.id("user-list"));
        if (element.getText().contains("fedb6da1-107c-4b43-bad1-98d5ac52839b")) {
            System.out.println(" User YES! ");
        }
        else {
            System.out.println("User NO ");
        }

    }
    @Test
    public void aaaa(){
        List<WebElement> elements = driver.findElements(By.id("user-list"));
        for (WebElement el: elements)  {
            Assert.assertTrue(el.getText().contains("fedb6da1-107c-4b43-bad1-98d5ac52839b"));
        }
    }

@After

        public void postTiasi () {
            driver.quit();
        }

    }
