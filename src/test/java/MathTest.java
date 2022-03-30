import org.junit.Assert;
import org.junit.Test;

public class MathTest {


     @Test
    public void sumTest(){
         int x = 12;
         int y = 55;
         int realAns = 67;
         Assert.assertEquals(realAns, x+y);

    }

    @Test
    public void MaxInMathTest(){
         Assert.assertEquals(0, Math.max(-155, 0));
    }

    @Test
    public  void IsLowerCaseEqualsUpperCase(){
         String x = "danny";
         String y = x.toUpperCase();
         Assert.assertEquals(x, y);
    }

}
