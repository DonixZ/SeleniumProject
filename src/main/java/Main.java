import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        WebDriver ChromeTest = new ChromeDriver();

        ChromeTest.manage().window().maximize();
        ChromeTest.get("https://amazon.com"); // Opens amazon site

        WebElement SearchTextBox = ChromeTest.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")); // Search field
        SearchTextBox.sendKeys("duck car swing"); // Input value inside search field

        WebElement ClickSearch = ChromeTest.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")); // Search button
        ClickSearch.click(); // Click on search button

        ChromeTest.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click(); // Click on item after searching

        WebElement AddToCart = ChromeTest.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")); // Cart button
        AddToCart.click(); // Click Cart button

        ChromeTest.findElement(By.name("proceedToRetailCheckout")).click(); // Click on Checkout

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ChromeTest.close();


    }
}
