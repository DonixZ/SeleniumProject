import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTests {

    @Test
    public void sanityTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        WebDriver ChromeTest = new ChromeDriver();

        ChromeTest.manage().window().maximize();
        ChromeTest.get("https://amazon.com"); // Opens amazon site
        Assert.assertEquals("https://amazon.com", "https://amazon.com");

        ChromeTest.close();
    }
    }


