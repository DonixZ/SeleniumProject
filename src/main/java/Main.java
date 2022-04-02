import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        WebDriver ChromeTest = new ChromeDriver();

        ChromeTest.manage().window().maximize(); // Maximizes windows size
        ChromeTest.get("https://automationpractice.com/index.php"); // enters the site
        ChromeTest.findElement(By.className("login")).click(); // clicks on login
        ChromeTest.findElement(By.id("email_create")).sendKeys("Dannyzaletsky@gmail.com"); // sends value to email box
        ChromeTest.findElement(By.id("SubmitCreate")).click(); // clicks on create account
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ChromeTest.findElement(By.xpath("//*[@id=\"id_gender1\"]")).click(); // checks the Mr option
        ChromeTest.findElement(By.id("customer_firstname")).sendKeys("Daniel"); // sends value to first name box
        ChromeTest.findElement(By.id("customer_lastname")).sendKeys("Zaletsky"); // sends value to last name box
        ChromeTest.findElement(By.id("passwd")).sendKeys("9Y!vW@HRd7jUmt7"); // sends value to password box
        Select DaysBirthday = new Select(ChromeTest.findElement(By.id("days")));  // sets Days value to 18
        DaysBirthday.selectByIndex(18); // sets Days value to 18
        Select MonthsBirhday = new Select(ChromeTest.findElement(By.id("months"))); // sets Months value to 3
        MonthsBirhday.selectByIndex(3); // sets Months value to 3
        Select YearsBirhday = new Select(ChromeTest.findElement(By.id("years"))); // sets Years value to 1996
        YearsBirhday.selectByValue("1996"); // sets Years value to 1996
        ChromeTest.findElement(By.id("address1")).sendKeys("Mivtza Yoav 35"); // sends value to address box
        ChromeTest.findElement(By.id("city")).sendKeys("Beer Sheva"); // sends value to city box
        Select State = new Select(ChromeTest.findElement(By.id("id_state"))); // sets State value to 1 alabama
        State.selectByValue("1"); // sets State value to 1 alabama
        ChromeTest.findElement(By.id("postcode")).sendKeys("35242"); // sends value to zipcode box
        ChromeTest.findElement(By.id("phone_mobile")).sendKeys("0535261996"); // sends value to mobile phone box
        WebElement AddressAlias = ChromeTest.findElement(By.id("alias")); // clears and then sends value to Alias Address box
        AddressAlias.click(); // clears and then sends value to Alias Address box
        AddressAlias.clear(); // clears and then sends value to Alias Address box
        AddressAlias.sendKeys("Bobos"); // clears and then sends value to Alias Address box

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ChromeTest.close();
    }
}
