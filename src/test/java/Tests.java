import org.junit.Assert;
import org.junit.Test;

public class Tests {

    @Test
    public void getUrlTest() {
        SignInAutomation urlTest = new SignInAutomation
                ("C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        Assert.assertEquals("http://automationpractice.com/index.php",
                urlTest.getURL());
    }

    @Test
    public  void SignInTest(){
        SignInAutomation signInTest = new SignInAutomation
                ("C:\\Users\\danny\\Desktop\\Sel\\chromedriver.exe");
        Assert.assertEquals("My account - My Store", signInTest.SignIn());
    }


}






