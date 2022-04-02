import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        WebDriver ChromeTest = new ChromeDriver();

        // Opens the site
        ChromeTest.manage().window().maximize();
        ChromeTest.get("https://automationpractice.com/index.php");

        // Find the login button and clicks on it
        WebElement SignInButton = ChromeTest.findElement(By.className("login"));
        SignInButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the email typing field, clears it and send value
        WebElement EmailBox = ChromeTest.findElement(By.id("email_create"));
        EmailBox.click();
        EmailBox.sendKeys("Dannyzaletsky@gmail.com");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the Create Account button and clicks on it
        WebElement CreateAccButton = ChromeTest.findElement(By.id("SubmitCreate"));
        CreateAccButton.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the Mr check button and clicks on it
        WebElement IdGender = ChromeTest.findElement(By.id("id_gender1"));
        IdGender.click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the First name field and sends value
        WebElement FirstName = ChromeTest.findElement(By.id("customer_firstname"));
        FirstName.click();
        FirstName.sendKeys("Daniel");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the last name field and sends value
        WebElement LastName = ChromeTest.findElement(By.id("customer_lastname"));
        LastName.click();
        LastName.sendKeys("Zaletsky");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the password field and sends value
        WebElement PasswordSignUp = ChromeTest.findElement(By.id("passwd"));
        PasswordSignUp.click();
        PasswordSignUp.clear();
        PasswordSignUp.sendKeys("9Y!vW@HRd7jUmt7");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the days drop down box and selects value
        Select DaysBirthday = new Select(ChromeTest.findElement(By.id("days")));
        DaysBirthday.selectByIndex(18);

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the months drop down box and selects value
        Select MonthsBirhday = new Select(ChromeTest.findElement(By.id("months")));
        MonthsBirhday.selectByIndex(3);

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the years drop down box and selects value
        Select YearsBirhday = new Select(ChromeTest.findElement(By.id("years")));
        YearsBirhday.selectByValue(String.valueOf(1996));

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the adress box and sends value
        WebElement Address = ChromeTest.findElement(By.id("address1"));
        Address.click();
        Address.sendKeys("Mivtza Yoav 35");

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the city box and sends value
        WebElement City = ChromeTest.findElement(By.id("city"));
        City.click();
        City.sendKeys("Beer Sheva");

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the state drop down box and chooses value
        Select State = new Select(ChromeTest.findElement(By.id("id_state")));
        State.selectByValue("1");

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the zipcode box and sends value
        WebElement ZipCode = ChromeTest.findElement(By.id("postcode"));
        ZipCode.click();
        ZipCode.sendKeys("35242");

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // Finds the mobile phone box and sends value
        WebElement MobilePhone = ChromeTest.findElement(By.id("phone_mobile"));
        MobilePhone.click();
        MobilePhone.sendKeys("0535261996");

        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Finds the alias box and sends value
        WebElement AddressAlias = ChromeTest.findElement(By.id("alias"));
        AddressAlias.click();
        AddressAlias.clear();
        AddressAlias.sendKeys("Bobos");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

            ChromeTest.close();
        }





















    }
}
