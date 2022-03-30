import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        WebDriver ChromeTest = new ChromeDriver();

        ChromeTest.manage().window().maximize();
        ChromeTest.get("https://google.co.il"); // Opens google site
        try {
            Thread.sleep(2500); // Wait for 2.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ChromeTest.get("https://amazon.com"); // Opens amazon site


    }
}
