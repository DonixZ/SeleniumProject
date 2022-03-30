import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        WebDriver ChromeTest = new ChromeDriver();

        ChromeTest.manage().window().maximize();
        ChromeTest.get("https://google.co.il");
        ChromeTest.get("https://amazon.com");
        

    }
}
